/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import modelo.Funcionario;

/**
 *
 * @author a140234x
 */
public class FuncionarioDAO {
private ArrayList<Funcionario> lista;
    private static FuncionarioDAO instaciaDao;
    
    private FuncionarioDAO(){
       this.lista = new ArrayList<Funcionario>(); 
    }
    public static FuncionarioDAO obterInstancia(){
        if(instaciaDao == null){
            instaciaDao = new FuncionarioDAO();
        }
        return instaciaDao;
    }
    public ArrayList<Funcionario> listarTodos(){
        return this.lista;
    }
    public void inserir(Funcionario funcionario) throws Exception{
        if(funcionario == null){
            throw new Exception("O Funcionario não foi instanciado");
        }
         if(funcionario.getDataAdmissao()==null){
            throw new Exception("Digite a data de admissão");
        }
        if(funcionario.getDataAdmissao().equals("")){
            throw new Exception("Digite a data de admissao");
        }
        if(funcionario.getCargo().trim().equals("")){
            throw new Exception("Digite o nome do funcionario");
        }
        if(funcionario.getCargo()==null){
            throw new Exception("Digite o cargo do funcionario");
        }
        if(funcionario.getSalario()<=0){
            throw new Exception("O salario do funcionario deve ser superior a zero");
        }
        if(funcionario.getNome().trim().equals("")){
            throw new Exception("Digite o cargo do funcionario");
        }
        if(funcionario.getNome()==null){
            throw new Exception("Digite o nome do funcionario");
        }
        if(funcionario.getDataNasc().equals("")){
            throw new Exception("Digite a data de nascimento");
        }
        if(funcionario.getDataNasc()==null){
            throw new Exception("Digite a data nascimento:");
        }
         if(funcionario.getRG()==null){
            throw new Exception("Digite o RG");
        }
        if(funcionario.getRG().trim().equals("")){
            throw new Exception("Digite o RG");
        }
        if(funcionario.getCPF()==null){
            throw new Exception("Digite o CPF");
        }
        if(funcionario.getCPF().trim().equals("")){
            throw new Exception("Digite o CPF");
        }
       if(this.verificaExistencia(funcionario)>=0){
           throw new Exception("O funcionario já se encontra cadastrado");
       }
        this.lista.add(funcionario);
        
    }
    public int verificaExistencia(Funcionario funcionario){
        int retorno = -1;
        for (int i=0; i < this.lista.size(); i++){
            if(funcionario.getCPF().trim().equals(this.lista.get(i).getCPF().trim())){
                retorno = i;
                break;
            }
        }
        return retorno;
    }
}

