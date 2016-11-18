/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
/**
 *
 * @author a140234x
 */
public class Venda {
    private String data;
    private int numero;
    private ArrayList<ItemVenda> itensdavenda;
    private Cliente cliente;
    
    public Venda(){
       this.itensdavenda = new ArrayList<ItemVenda>();
       this.cliente = new Cliente();
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the itensdavenda
     */
    public ArrayList<ItemVenda> getItensdavenda() {
        return itensdavenda;
    }

    /**
     * @param itensdavenda the itensdavenda to set
     */
    public void setItensdavenda(ArrayList<ItemVenda> itensdavenda) {
        this.itensdavenda = itensdavenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public float getValorTotal(){
        float retorno = 0;
        for (int i=0; i <this.itensdavenda.size(); i++){
        float valor = (this.itensdavenda.get(i).getQtdade() * this.itensdavenda.get(i).getPreco());
        retorno = retorno+valor;
    }
        return retorno;
    }
}
