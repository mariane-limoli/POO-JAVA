
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author MarianeNicolau
 */
public class Atendente extends Pessoa{
    private String regFunc;
    private String turno;
    private ArrayList<QuartoHotel> quartoHotel;

    public Atendente(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        quartoHotel = new ArrayList<QuartoHotel>();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }
    public void addQuartoHotel(QuartoHotel q){
        quartoHotel.add(q); 
       
         }
    public void removeQuarto(QuartoHotel q){
        for(int i=0; i<quartoHotel.size(); i++){
            if(q == quartoHotel.get(i))
            quartoHotel.remove(i);
        }
    }
    
}
