
import java.util.Scanner;

/**
 *
 * @author AlmeidMa
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String descProd;
        int codProd, qtdeVend;
        double precUnit, valPagar;
        
        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt(); //scanf("%d", &codProd)
        System.out.print("Digite a descrição do produto: ");
        descProd = entrada.next(); //scanf("%s", &descProd);
        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble(); //scanf("%lf", &precUnit);
        System.out.print("Digite a qtde. vendida: ");
        qtdeVend = entrada.nextInt(); //scanf("%d", &qtdeVend);
        valPagar = precUnit * qtdeVend;
        System.out.println("Valor a pagar R$ " + valPagar);    
     } //fim do main   
}//fim da classe
