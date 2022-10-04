
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author AlmeidMa
 */
public class Aplic {
    public static void main(String[] args) {
        int numero;
        double saldo;
        double valor;
        int option;
        
        Scanner enter = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.print("Número: ");
        numero = enter.nextInt();
        System.out.print("Saldo: ");
        saldo = enter.nextDouble();
        
        ContaCorrente objContCorr = new ContaCorrente(numero, saldo);
        
        do{        
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Digite sua opçao: ");
            option = enter.nextInt();
            
            switch (option){
                case 1: 
                    System.out.printf("Valor do deposito na conta %d: ", objContCorr.getNumero());
                    valor = enter.nextDouble();
                    objContCorr.depositar(valor);
                    break;                   
                case 2:
                    System.out.printf("Valor do saque da conta %d: ", objContCorr.getNumero());
                    valor = enter.nextDouble();
                    
                    if(objContCorr.getSaldo() >= valor ){
                    objContCorr.sacar(valor);
                    }
                    else System.out.print("Saldo Insuficiente");
                    break;
                case 3:
                    System.out.print("Saldo atual da conta " + objContCorr.getNumero() + ": R$ " + df.format(objContCorr.getSaldo()));
                    break;
            }
        }while (option < 4);        
    }    
}
        