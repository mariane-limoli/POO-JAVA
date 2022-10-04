
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;


public class Aplic {

    public static void main(String[] args) {
      String nome;
      int codigo, i;
      double taxaComissao, limiteCredito;
      DecimalFormat df = new DecimalFormat("##0.00");
      Vendedor objVendedor = new Vendedor(0.1, 1010, "Pablo Escobar" );
      
      Cliente[] objClientes = new Cliente[2];
     
      objClientes[0] = new Cliente(500, 5566, "Michael Scott");
      objClientes[1] = new Cliente(900, 3320,"Shakira da Silva" );    
      
      objClientes[0].addCompra(249.99);
      objClientes[1].addCompra(600);
      
      for(i=0; i<2; i++){
           objVendedor.addVenda(objClientes[i].getTotalCompras());
      }
      
      for(i=0; i<2; i++){
        System.out.println("Limite disponpivel do(a) cliente Sr(a) " + objClientes[i].getNome()+": " + df.format( objClientes[i].calcLimiteDisponivel()));
      }
      
        System.out.println("Comissao do vendedor " +objVendedor.getNome()+": R$ "+df.format(objVendedor.calcValorComissao()));
      
      
    }
    
}
