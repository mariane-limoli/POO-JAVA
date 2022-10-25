/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.moel;

import fatec.poo.model.Pessoa;

/**
 *
 * @author AlmeidMa
 */
public class Cliente extends Pessoa{
    private int pedido;
    private int formaPagamento;
    private double totalPagar;

    public Cliente(int pedido, int codigo, String nome) {
        super(codigo, nome);
        this.pedido = pedido;
       // this.totalPagar = totalPagar;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }
    
    
}
