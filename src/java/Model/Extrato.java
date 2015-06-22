/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author alexandre
 */
public class Extrato {
 
    private int idExtrato;
    private Conta idConta;
    private Date dataTrans;
    private int agOrigem;
    private double valor;
    private String descricao;

    public int getIdExtrato() {
        return idExtrato;
    }

    public void setIdExtrato(int idExtrato) {
        this.idExtrato = idExtrato;
    }

    public Conta getIdConta() {
        return idConta;
    }

    public void setIdConta(Conta idConta) {
        this.idConta = idConta;
    }

    public Date getDataTrans() {
        return dataTrans;
    }

    public void setDataTrans(Date dataTrans) {
        this.dataTrans = dataTrans;
    }

    public int getAgOrigem() {
        return agOrigem;
    }

    public void setAgOrigem(int agOrigem) {
        this.agOrigem = agOrigem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
