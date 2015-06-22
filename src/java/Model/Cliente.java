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
public class Cliente {
  private int idCliente;
  private String nome;
  private String sobrenome;
  private String senha;
  private int idAgencia;

    public int getId() {
        return idCliente;
    }

    public void setId(int id) {
        this.idCliente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAgencia() {
        return idAgencia;
    }

    public void setAgencia(int agencia) {
        this.idAgencia = agencia;
    }
    
}
