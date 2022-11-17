
import fatec.poo.model.Atendente;
import fatec.poo.model.Hospede;
import fatec.poo.model.QuartoHotel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlmeidMa
 */
public class AplicHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Hospede objHospede1 = new Hospede("455805", "Mariane"); //String cpf, String nome)
        Hospede objHospede2 = new Hospede("455999", "Ricardo"); //String cpf, String nome)
        
        Atendente objAtendente = new Atendente("1010", "Pablo"); //String regFunc, String nome) 
        
        QuartoHotel objQuarto = new QuartoHotel(1, 100); //(int numQuarto, double valorDiaria) 
        QuartoHotel objQuarto2 = new QuartoHotel(2, 200);
        
        objAtendente.addQuartoHotel(objQuarto);
        objAtendente.addQuartoHotel(objQuarto2);
        objQuarto.reservar(objHospede1, objAtendente);
        objQuarto2.reservar(objHospede2, objAtendente);
        
        System.out.println("hospede do quarto" + objQuarto.getNumQuarto() + ": " + objQuarto.getHospede().getNome()  );
        System.out.println("Situação quarto "+objQuarto.getNumQuarto()+": " + objQuarto.getSituacao() );
        System.out.println("Atendente do quarto " + objQuarto2.getNumQuarto() + ": " + objQuarto2.getAtendente().getNome()+ " RegFunc: " + objQuarto2.getAtendente().getRegFunc() );
        
    }
    
}
