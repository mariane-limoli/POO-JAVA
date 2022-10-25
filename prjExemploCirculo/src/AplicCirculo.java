
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author AlmeidMa
 */
public class AplicCirculo {

   
    public static void main(String[] args) {
        double raio;
        
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        Circulo objCirculo = new Circulo();
        
        System.out.println("\t---EXERCÍCIO DO CÍRCULO---");
        System.out.print("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        
        objCirculo.setRaio(raio);
        
        
        System.out.println("O circulo possui um raio de " +df.format( objCirculo.getRaio()));
        System.out.println("A área é: " + df.format( objCirculo.calcArea()));
        System.out.println("O perimetro é: " + df.format( objCirculo.calcPerimetro()));
        System.out.println("O diametro é: " + df.format( objCirculo.calcDiametro()));
        
        
        
        
    }
    
}
