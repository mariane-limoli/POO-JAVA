
package fatec.poo.model;

/**
 *
 * @author MarianeNicolau
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }
    
    public void reservar(Hospede h, Atendente a){
        situacao = true;        
        atendente = a;
        a.addQuartoHotel(this);
        hospede = h;
        h.setQuartoHotel(this);      
        
    }
    
    public double liberar(int qntDias, double txDesconto){
        situacao = false;
        dataEntrada = null;
        hospede.setQuartoHotel(null);
        hospede = null;        
        atendente.removeQuarto(this);
        atendente = null;
        
        double pagamento = (qntDias*valorDiaria);
        pagamento -= (valorDiaria*txDesconto/100);
        return pagamento;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }
    
    
    
}
