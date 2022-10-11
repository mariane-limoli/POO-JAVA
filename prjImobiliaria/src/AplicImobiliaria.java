
import fatec.poo.model.Corretor;
import fatec.poo.model.Proprietario;
import java.util.Scanner;

public class AplicImobiliaria {
    public static void main(String[] args) {
         
    //Scanner entrada = new Scanner(System.in);  
    Corretor[] corretor = new Corretor[3];
    Proprietario[] proprietario = new Proprietario[3];
    
    
    //Corretor(double taxaLocacao, int codigo, String nome) {
    corretor[0] = new Corretor(5, 9090, "Felipe");
    corretor[1] = new Corretor(2, 444, "Eduardo");
    corretor[2] = new Corretor(4, 2222, "Carlos");
                                      //double valorAluguel, int codigo, String nome)
    proprietario[0] = new Proprietario(1500, 9090, "Alda");
    proprietario[1] = new Proprietario(900, 2222, "Alda");
    proprietario[2] = new Proprietario(1000, 4444, "Alda");
            
            
    
   
            
    
    }
    
    
}
