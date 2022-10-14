
package fatec.poo.model;


public class Corretor extends Pessoa{
    private double taxaLocacao;
    private double totalLocacao;

    public Corretor(double taxaLocacao, int codigo, String nome) {
        super(codigo, nome);
        this.taxaLocacao = taxaLocacao;
    }

    public double getTaxaLocacao() {
        return taxaLocacao;
    }

    public double getTotalLocacao() {
        return totalLocacao;
    }

    public void setTaxaLocacao(double taxaLocacao) {
        this.taxaLocacao = taxaLocacao;
    }
    
    
    
}
