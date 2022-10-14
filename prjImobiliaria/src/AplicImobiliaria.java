
import fatec.poo.model.Corretor;
import fatec.poo.model.Proprietario;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AplicImobiliaria {
    public static void main(String[] args) {
        int opcao, i;
         int cod;
         double taxaLoc;
        String nome;
    Scanner entrada = new Scanner(System.in);  
    DecimalFormat df = new DecimalFormat("0");
    Corretor[] corretor = new Corretor[3];
    Proprietario[] proprietario = new Proprietario[3];
    
    
    
    //Corretor(double taxaLocacao, int codigo, String nome) {
    corretor[0] = new Corretor(5, 9090, "Felipe");
    corretor[1] = new Corretor(2, 444, "Eduardo");
    corretor[2] = new Corretor(4, 2222, "Carlos");
                                      //double valorAluguel, int codigo, String nome)
    proprietario[0] = new Proprietario(1500, 9090, "Alda");
    proprietario[1] = new Proprietario(900, 2222, "Cássia");
    proprietario[2] = new Proprietario(1000, 4444, "Lauro");
         System.out.println("código\tnome\ttaxa de locação(%)");  
       for(i=0; i<3; i++)     {
           System.out.println( corretor[i].getCodigo()+ "\t"+ corretor[i].getNome() +"\t\t"+ df.format(corretor[i].getTaxaLocacao()));
       }
    System.out.println("\ncódigo\tnome\tvalor do aluguel");
    for( i=0; i<3; i++){
        System.out.println(proprietario[i].getCodigo()+"\t"+ proprietario[i].getNome()+"\t\t" + proprietario[i].getValorAluguel());
    }
        
    do{
           System.out.println("\n\n1 - Alterar cadastro de proprietario\n"
                   + "2 - Alterar cadastro de corretores\n"
                   + "3 - Sair");
           System.out.print("Digite sua opção: ");
           opcao = entrada.nextInt();
           i=0;
           switch(opcao){
               case 1:
                   System.out.println("Qual proprietário deseja atualizar o cadastro?");
                   i = entrada.nextInt();
                   
                   System.out.print("Nome: ");
                   nome = entrada.next();
                   System.out.print("Código: ");
                   cod = entrada.nextInt();
                   System.out.print("Valor Aluguel: ");
                   taxaLoc = entrada.nextDouble();
                   
                   proprietario[i-1].setNome(nome);
                   proprietario[i-1].setCodigo(cod);
                   proprietario[i-1].setValorAluguel(taxaLoc);
                   
                   System.out.println("\n\ncódigo\tnome\t1Valor do aluguel");  
                    for(i=0; i<3; i++)     {
                        System.out.println( proprietario[i].getCodigo()+ "\t"+ proprietario[i].getNome() +"\t\t"+ proprietario[i].getValorAluguel());
                    }
                    break;
               case 2:
                   System.out.println("Qual corretor deseja atualizar o cadastro?");
                   i = entrada.nextInt();
                   
                   System.out.print("Nome: ");
                   nome = entrada.next();
                   System.out.print("Código: ");
                   cod = entrada.nextInt();
                   System.out.print("Taxa Locação: ");
                   taxaLoc = entrada.nextDouble();
                   
                   corretor[i-1].setNome(nome);
                   corretor[i-1].setCodigo(cod);
                   corretor[i-1].setTaxaLocacao(taxaLoc);
                   
                   System.out.println("\n\ncódigo\tnome\ttaxa de locação(%)");  
                    for(i=0; i<3; i++)     {
                        System.out.println( corretor[i].getCodigo()+ "\t"+ corretor[i].getNome() +"\t\t"+ df.format(corretor[i].getTaxaLocacao()));
                    }
                    break;
                   
            }
           
    }while(opcao < 3);
  
        
    
    }
    
    
}
