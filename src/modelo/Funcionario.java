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
public class Funcionario extends Pessoa {
    public float salario;
    private Date dataAdmissao;
    public String cargo;

    public Funcionario(float salario, Date dataAdmissao, String cargo, String nome, Date dataNasc, String RG, String CPF) {
        super(nome, dataNasc, RG, CPF);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String getNome(){
	return super.getNome();
	}
    @Override
    public String toString() {
        return super.toString() + " ---- Cargo = "+cargo;
    }
}
