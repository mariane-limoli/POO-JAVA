import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

// @author Mariane

public class Aplic {
    public static void main(String[] args) {
        double saldo, valor;
        int num, opcao, i;
      
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        ContaCorrente[] objMtzConta = new ContaCorrente[3];
        
        for(i=0; i<3; i++){
            System.out.printf("Digite o número da conta %d: ", (i+1));
            num = input.nextInt();
            System.out.print("Digite o saldo da conta: R$ ");
            saldo = input.nextDouble();
            
            objMtzConta[i] = new ContaCorrente(num, saldo);                                                                   
        }
        do{
            System.out.println("\n1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            System.out.print("\nDigite sua opçao: ");
            opcao = input.nextInt();
            
            switch(opcao){
                case 1: System.out.print("Digite o número da conta: ");
                        num = input.nextInt();                       
                        i=0;                                                               
                        while(i<3 && num != objMtzConta[i].getNumero()){
                            i++;
                        }
                        if(i == 3){
                             System.out.println("Conta não cadastrada!");  
                        }
                        else{
                            System.out.print("Digite o valor do saque: R$ ");
                            valor = input.nextDouble();
                            
                            if(valor < objMtzConta[i].getSaldo()){
                                objMtzConta[i].sacar(valor);
                            }
                            else {
                                System.out.println("Saldo insuficiente!");                                   
                            }
                        }                    
                    break;
                                              
                case 2: System.out.print("Digite o número da conta: ");
                        num = input.nextInt();
                        i=0;                                                               
                        while(i<3 && num != objMtzConta[i].getNumero()){
                            i++;
                        }
                        if(i == 3){
                            System.out.println("Conta não cadastrada!");  
                        }    
                        else {
                            System.out.print("Digite o valor do depósito: R$ ");
                            valor = input.nextDouble();
                            objMtzConta[i].depositar(valor);                                
                        }                                                
                    break;
               
                case 3: System.out.print("Digite o número da conta que deseja consultar o saldo: ");
                        num = input.nextInt();
                        i=0;                                                               
                        while(i<3 && num != objMtzConta[i].getNumero()){
                            i++;
                        }
                        if(i == 3){
                            System.out.println("Conta não cadastrada!");  
                        }
                        else { 
                            System.out.println("Saldo: " + df.format(objMtzConta[i].getSaldo()));
                        }                                                                         
                    break;
                       
                case 4: System.out.println("\nCONTA       SALDO");
                        for(i =0; i<3; i++){
                            System.out.println(objMtzConta[i].getNumero() + "          " +df.format(objMtzConta[i].getSaldo()));
                        }
                    break;
            }            
        }while(opcao < 5);       
    }    
}
