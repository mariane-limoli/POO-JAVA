
package fatec.poo.model;

/**
 *
 * @author MarianeNicolau
 */
public class Hospede extends Pessoa{
    private String cpf;
    private double txDesconto;
    private QuartoHotel quartoHotel;

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTxDesconto() {
        return txDesconto;
    }
    
    // SET E GET QUARTO HOTEL

    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }
    
}
