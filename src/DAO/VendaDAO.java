/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import modelo.Venda;

/**
 *
 * @author a140234x
 */
public class VendaDAO {
    private ArrayList<Venda> lista;
    private static VendaDAO instaciaDao;
    
    private VendaDAO(){
       this.lista = new ArrayList<Venda>(); 
    }
     public static VendaDAO obterInstancia(){
        if(instaciaDao == null){
            instaciaDao = new VendaDAO();
        }
        return instaciaDao;
    }
    public ArrayList<Venda> listarTodos(){
        return this.lista;
    }
    public void inserir(Venda venda) throws Exception{
        if(venda== null){
            throw new Exception("A venda não foi instanciada");
        }
        if(venda.getNumero() <= 0){
            throw new Exception("Informar o numero da venda");
        }
        if(venda.getData() == null){
            throw new Exception("Informar a data da venda");
        }
        if(venda.getData().trim().equals("")){
            throw new Exception("Informar a data da venda");
        }
        if(venda.getItensdavenda().size() <=0){
            throw new Exception("Informar pelo menos um item de venda");
        }
        if(this.verificaExistencia(venda)>=0){
           throw new Exception("A venda já se encontra cadastrado");
       }
        this.lista.add(venda);
    }
     public int verificaExistencia(Venda venda){
        int retorno = -1;
        for (int i=0; i < this.lista.size(); i++){
            if(venda.getNumero()==this.lista.get(i).getNumero()){
                retorno = i;
                break;
            }
        }
        return retorno;
    }
}
