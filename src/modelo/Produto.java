/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author a140234x
 */
public class Produto {

   
    private String nome;
    private String cod;
    private float preco;
    

    public Produto(String nome, String cod, float preco) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
    }

    Produto() {
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

   
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
	return "Nome = " + nome + "Código= "+cod+"-- Preço ="+preco;
    }
}
  
//    // Metodo para cadastrar os produtos
//public void cadastrarProdutos(String nome, int cod, int qtdade, float preco) {
// 
//Produto novoProduto = new Produto();
//novoProduto.nome= nome;
//novoProduto.cod = cod;
//novoProduto.qtdade = qtdade;
//novoProduto.preco = preco;
//Produto.cadastrarProdutos(Produto);
// 
//JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
//
//}// Fim do metodo para cadastrar os produtos
// 
//
//public void imprimirDados() {
//    
//}
//}