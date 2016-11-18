/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author a140234x
 */
public class ClienteDAO {
    private ArrayList<Cliente> lista;
    private static ClienteDAO instaciaDao;
    
    private ClienteDAO(){
       this.lista = new ArrayList<Cliente>(); 
    }
    public static ClienteDAO obterInstancia(){
        if(instaciaDao == null){
            instaciaDao = new ClienteDAO();
        }
        return instaciaDao;
    }
    public ArrayList<Cliente> listarTodos(){
        return this.lista;
    }
    public void inserir(Cliente cliente) throws Exception{
        if(cliente==null){
            throw new Exception("O cliente não foi instanciado");
        }
         if(cliente.getDataCadastro()==null){
            throw new Exception("Digite a data de hoje");
        }
        if(cliente.getDataCadastro().equals("")){
            throw new Exception("Digite a data de hoje");
        }
        if(cliente.getNome().trim().equals("")){
            throw new Exception("Digite o nome do cliente");
        }
        if(cliente.getNome()==null){
            throw new Exception("Digite o nome do cliente");
        }
        if(cliente.getDataNasc().equals("")){
            throw new Exception("Digite o nome do cliente");
        }
        if(cliente.getDataNasc()==null){
            throw new Exception("data nascimento:");
        }
         if(cliente.getRG()==null){
            throw new Exception("Digite o RG");
        }
        if(cliente.getRG().trim().equals("")){
            throw new Exception("Digite o RG");
        }
        if(cliente.getCPF()==null){
            throw new Exception("Digite o CPF");
        }
        if(cliente.getCPF().trim().equals("")){
            throw new Exception("Digite o CPF");
        }
       if(this.verificaExistencia(cliente)>=0){
           throw new Exception("O cliente já se encontra cadastrado");
       }
        this.lista.add(cliente);
        
    }
    public int verificaExistencia(Cliente cliente){
        int retorno = -1;
        for (int i=0; i < this.lista.size(); i++){
            if(cliente.getCPF().trim().equals(this.lista.get(i).getCPF().trim())){
                retorno = i;
                break;
            }
        }
        return retorno;
    }
}
