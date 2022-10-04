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
public class Vendedor extends Pessoa{
    private double taxaComissao;
    private double totalVendas;

    public Vendedor(double taxaComissao, int codigo, String nome) {
        super(codigo, nome);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVenda(double totalCompras ){
        totalVendas += totalCompras;
    }
    
    public double calcValorComissao(){
        return taxaComissao*totalVendas;
    }
}
