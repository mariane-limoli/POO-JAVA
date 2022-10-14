
package fatec.poo.model;

public class Proprietario extends Pessoa {
    private double valorAluguel;

    public Proprietario(double valorAluguel, int codigo, String nome) {
        super(codigo, nome);
        this.valorAluguel = valorAluguel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    
}
