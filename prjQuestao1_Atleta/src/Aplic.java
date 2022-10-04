
import fatec.poo.model.Atleta;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Aplic {

    public static void main(String[] args) {
       String nome;
       double altura, peso;
       int i=0, opcao;
       
       Scanner entrada = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("0.00");
       Atleta[] objAtleta = new Atleta[5];
       
       
       do{
        System.out.print("\n1 - Cadastrar atleta"
                        + "\n2 - Exibir IMC"
                        + "\n3 - Fim"
                        + "\n\n\tOpção");
        
        opcao = entrada.nextInt();
        
        switch (opcao){
            case 1:
                if(i<3){
                    System.out.print("Nome: ");
                    nome = entrada.next();
                    System.out.print("Peso: ");
                    peso = entrada.nextDouble();
                    System.out.print("Altura: ");
                    altura = entrada.nextDouble();
                    
                    objAtleta[i] = new Atleta(nome);
                    objAtleta[i].setAltura(altura);
                    objAtleta[i].setPeso(peso);
                    i++;
                }
                else System.out.println("Não é possível cadastrar um atleta!");
                break;
            case 2:
                System.out.println("Nome\tPeso\tAltura\tIMC");
                for(int j=0; j<i; j++){
                    System.out.println(objAtleta[j].getNome()+"\t"
                                        + objAtleta[j].getPeso()+"\t"
                                        + objAtleta[j].getAltura()+"\t"
                                        + df.format( objAtleta[j].calcIMC()));
                }
                break;
        }
       }while(opcao<3);
    }
    
}
