
package fatec.poo.model;
// @author Mariane
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        situacao = false;
    }
    
    public void reservar(int numRG){
        situacao = true;
    }
    public double liberar(int diasReservados){
        double totalPago = diasReservados * valorDiaria;
        totalFaturado += totalPago;
        numRG = 0;
        situacao = false;
        return totalPago;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getTotalFaturado() {       
        return totalFaturado;
    }    
}
