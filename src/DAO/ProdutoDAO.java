/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author a140234x
 */
public class ProdutoDAO {
    private ArrayList<Produto> lista;
    private static ProdutoDAO instaciaDao;
    
    private ProdutoDAO(){
       this.lista = new ArrayList<Produto>(); 
    }
     public static ProdutoDAO obterInstancia(){
        if(instaciaDao == null){
            instaciaDao = new ProdutoDAO();
        }
        return instaciaDao;
    }
    public ArrayList<Produto> listarTodos(){
        return this.lista;
    }
    public void inserir(Produto produto) throws Exception{
        if(produto==null){
            throw new Exception("O Produto não foi instanciado");
    }
        if(produto.getNome().trim().equals("")){
            throw new Exception("Digite o nome do cliente");
        }
        if(produto.getNome()==null){
            throw new Exception("Digite o nome do cliente");
        }
     
        if(produto.getCod() == null){
            throw new Exception("Digite o código");
        }
        if(produto.getCod().trim().equals("")){
            throw new Exception("Digite o código");
        }
        if(produto.getPreco()<=0){
            throw new Exception("O preço do produto deve ser superior a zero");
        }
        if(this.verificaExistencia(produto)>=0){
           throw new Exception("O cliente já se encontra cadastrado");
       }
        this.lista.add(produto);
    }
        public int verificaExistencia(Produto produto){
        int retorno = -1;
        for (int i=0; i < this.lista.size(); i++){
            if(produto.getCod().trim().equals(this.lista.get(i).getCod().trim())){
                retorno = i;
                break;
            }
        }
        return retorno;
    }
}
    