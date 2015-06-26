/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alexandre
 */
public class Conta {
    
    private int idConta;
    private Cliente idCliente;
    private double saldo;
    private double poupanca;
    
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(double poupanca) {
        this.poupanca = poupanca;
    }
    
    
    
}
