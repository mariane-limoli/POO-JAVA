
import fatec.poo.moel.Cliente;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlmeidMa
 */
public class AplicRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pedido;
        int formPag;
        double totalPag;
        
        Scanner input = new Scanner(System.in);
        Cliente[] objCliente = new Cliente[3];
        
        for(int i=0; i<3; i++){
            pedido = input.nextInt();
            formPag = input.nextInt();
            totalPag = input.nextDouble();
            //int pedido, double totalPagar, int codigo, String nome
            objCliente[i] = new Cliente(pedido, totalPagar, )
        }
        
    }
    
}
