
import fatec.poo.model.Circulo;
import java.util.Scanner;
/**
 *
 * @author AlmeidMa
 */
public class AplicCirculo {

   
    public static void main(String[] args) {
        double raio;
        
        Scanner entrada = new Scanner(System.in);
        Circulo objCirculo = new Circulo();
        
        System.out.print("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        
        objCirculo.setRaio(raio);
        
        System.out.println("O circulo possui um raio de " + objCirculo.getRaio());
        System.out.println("A área é: " + objCirculo.calcArea());
        System.out.println("O perimetro é: " + objCirculo.calcPerimetro());
        System.out.println("O diametro é: " + objCirculo.calcDiametro());
        
        
        
        
    }
    
}
