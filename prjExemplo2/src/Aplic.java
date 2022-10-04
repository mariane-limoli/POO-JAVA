
import fatec.poo.model.Exemplo2;
import java.util.Scanner;
/**
 *
 * @author AlmeidMa
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ra, opcao;
        double p1, p2;
        double t1, t2;
        
        Scanner entrada = new Scanner(System.in);
        Exemplo2 aluno = new Exemplo2();
        
        //ALUNO:
        System.out.print("Digite o RA do aluno: ");
        ra = entrada.nextInt();
        aluno.setRA(ra);
        
        //PROVAS:
        System.out.print("P1: ");
        p1 = entrada.nextDouble();
        System.out.print("P2: ");
        p2 = entrada.nextDouble();
        aluno.setntP1(p1);
        aluno.setntP2(p2);
        
        //TRABALHOS:
        System.out.print("Trabalho 1: ");
        t1 = entrada.nextDouble();
        System.out.print("Trabalho 2: ");
        t2 = entrada.nextDouble();
        aluno.setntTrab1(t1);
        aluno.setntTrab2(t2);
        
        do{
            System.out.println("\nMenu do aluno " + aluno.getRA());
            System.out.println("1 - Exibir Nota das Provas e Trabalhos");
            System.out.println("2 - Exibir Média das Provas e Trabalhos");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1: System.out.println("Nota P1:" + aluno.getntP1());
                        System.out.println("Nota P2:" + aluno.getntP2());
                        System.out.println("Nota Trabalho 1:" + aluno.getntTrab1());
                        System.out.println("Nota Trabalho 2:" + aluno.getntTrab2());
                        break;
                case 2: System.out.println("Média das Provas: " + aluno.calcMediaProva());
                        System.out.println("Média dos Trabalhos: " + aluno.calcMediaTrab());
                        break;
                case 3: System.out.println("Média final: " + aluno.calcMediaFinal());
                        break;
            }   
            
        } while(opcao != 4);       
    }
}
