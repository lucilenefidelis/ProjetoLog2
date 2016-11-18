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
public class Cliente extends Pessoa{
    
    private Date dataCadastro;

    public Cliente( Date dataCadastro, String nome, Date dataNasc, String RG, String CPF) {
        super(nome, dataNasc, RG, CPF);
        this.dataCadastro = dataCadastro;
    }

   

   
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    @Override
    public String getNome(){
	return super.getNome();
	}
    
    @Override
    public String toString() {
         return super.toString() + " ---- Data Cadastro = "+ dataCadastro ;
	}
}
