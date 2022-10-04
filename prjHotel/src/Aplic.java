
import fatec.poo.model.QuartoHotel;
import java.util.Scanner;

//@author Mariane
public class Aplic {
    public static void main(String[] args) {
     int RG, diasReservados;
     int numQuarto;
     double valorDiaria, totFaturado=0;
     int opcao,i;
     
     
     
     Scanner entrada = new Scanner(System.in);     
     QuartoHotel[] mtzQuarto = new QuartoHotel[3];
     
     for(i=0; i< mtzQuarto.length; i++){
         System.out.print("Número do quarto: ");
         numQuarto = entrada.nextInt();
         System.out.print("Valor da diária: R$ ");
         valorDiaria = entrada.nextDouble();
         
         //chamada do método construtor:
         mtzQuarto[i] = new QuartoHotel(numQuarto, valorDiaria);
     }
     
     do{
         System.out.println("\n\n1 - Consultar quarto");
         System.out.println("2 - Reservar quarto");
         System.out.println("3 - Liberar quarto");
         System.out.println("4 - Consultar faturamento do quarto");
         System.out.println("5 - Consultar faturamento do hotel");
         System.out.println("6 - Sair");
         System.out.print("\n\tDigite a opcao desejada: ");
         opcao = entrada.nextInt();
         i=0;
         switch(opcao){
             case 1:
                 System.out.print("Qual quarto deseja consultar: ");
                 numQuarto = entrada.nextInt();
                 
                 while(i<mtzQuarto.length && numQuarto != mtzQuarto[i].getNumQuarto()){
                     i++;
                 }
                 if(i == mtzQuarto.length){
                     System.out.println("Quarto não cadastrado!");
                 }
                 else{
                     System.out.print("Quarto " + mtzQuarto[i].getNumQuarto());
                     if(mtzQuarto[i].getSituacao() == false)
                     System.out.println(": LIVRE");
                     else  System.out.println(": OCUPADO");
                }
                break;
             case 2:
                 System.out.print("Qual quarto deseja reservar: ");
                 numQuarto = entrada.nextInt();
                 
                 while(i<mtzQuarto.length && numQuarto != mtzQuarto[i].getNumQuarto()){
                     i++;
                 }
                 if(i == mtzQuarto.length){
                     System.out.println("Quarto não cadastrado!");
                 }
                 else{
                     if(mtzQuarto[i].getSituacao() == true){
                         System.out.println("O quarto "+mtzQuarto[i].getNumQuarto()+" já foi reservado!");
                     }
                     else{
                         System.out.print("RG do hospede: ");
                         RG = entrada.nextInt();
                         mtzQuarto[i].reservar(RG);
                         System.out.println("Quarto reservado com sucesso.");
                     }
                 }
                 break;
            
             case 3:
                 System.out.print("Qual quarto deseja liberar: ");
                 numQuarto = entrada.nextInt();
                 
                 while(i<mtzQuarto.length && numQuarto != mtzQuarto[i].getNumQuarto()){
                     i++;
                 }
                 if(i == mtzQuarto.length){
                     System.out.println("Quarto não cadastrado!");
                 }
                 else{
                     if(mtzQuarto[i].getSituacao() == false){
                         System.out.println("O quarto "+mtzQuarto[i].getNumQuarto()+" já está livre!");
                     }
                     else{
                         System.out.print("Total de dias reservados: ");
                         diasReservados = entrada.nextInt();
                         System.out.println("Valor a ser pago: R$ " + mtzQuarto[i].liberar(diasReservados));
                         
                     } 
                 }
                 break;
             case 4: 
                 System.out.print("Qual quarto deseja consultar o faturamento: ");
                 numQuarto = entrada.nextInt();
                 
                 while(i < mtzQuarto.length && numQuarto != mtzQuarto[i].getNumQuarto()){
                     i++;
                 }
                 if(i == mtzQuarto.length){
                     System.out.println("Quarto não cadastrado!");
                 }
                 else{
                     System.out.println("Faturamento do quarto R$ " +
                             mtzQuarto[i].getTotalFaturado());
                 }
                 break;
             case 5:
                 
                 for(int j=0; j<mtzQuarto.length; j++){
                     totFaturado += mtzQuarto[j].getTotalFaturado();
                 }
                   System.out.print("Faturamento total do Hotel: R$ " + totFaturado);                    
                   break;
             default: System.out.println("\nOpção invalida.");
         }
         
     }while(opcao != 6);
    }
    
}
