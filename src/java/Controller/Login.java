/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Conta;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alexandre, hugo e mateus
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    Connection conexao = null;

    @Override
    public void init() {
        try {
            conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/BancoSahuma", "sahuma", "sahuma");
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void destroy() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        try (PreparedStatement sql = conexao.prepareStatement("select * "
                + "from CLIENTE, CONTA "
                + "where CLIENTE.IDAGENCIA= ? and CONTA.IDCONTA= ?")) {
            sql.setInt(1, Integer.parseInt(request.getParameter("agencia")));
            sql.setInt(2, Integer.parseInt(request.getParameter("conta")));

            ResultSet resp = sql.executeQuery();
            Cliente cliente = new Cliente();
            Conta conta = new Conta();
            if (resp.next()) {
                cliente.setAgencia(resp.getInt("IDAGENCIA"));
                cliente.setId(resp.getInt("IDCLIENTE"));
                cliente.setNome(resp.getString("NOME"));
                cliente.setSobrenome(resp.getString("SOBRENOME"));
                cliente.setSenha(resp.getString("SENHA"));
                conta.setSaldo(resp.getDouble("SALDO"));
            }
            session.setAttribute("cliente", cliente);
            session.setAttribute("conta", conta);
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index2.jsp");

            if (dispatcher != null) {
                dispatcher.forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
