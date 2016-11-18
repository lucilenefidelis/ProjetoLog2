/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author a140234x
 */
public abstract class Pessoa {
    public String nome;
    private Date dataNasc;
    private String RG;
    private String CPF;
    

    public Pessoa(String nome, Date dataNasc, String RG, String CPF) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.RG = RG;
        this.CPF = CPF;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
        @Override
	public String toString() {
		return "Nome = " + nome+"--- Data Nascimento ="+dataNasc+"-- RG ="+RG+"-- CPF = " + CPF;
	}
    
    
}
