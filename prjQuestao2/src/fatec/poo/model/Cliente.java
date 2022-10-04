/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author AlmeidMa
 */
public class Cliente extends Pessoa{
    private double limiteCredito;
    private double totalCompras;

    public Cliente(double limiteCredito, int codigo, String nome) {
        super(codigo, nome);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addCompra(double valorCompra){
        totalCompras += valorCompra;
    }
    public double calcLimiteDisponivel(){
        return (limiteCredito - totalCompras);
    }
    
}
