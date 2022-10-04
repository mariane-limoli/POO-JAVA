
package fatec.poo.model;

/**
 *
 * @author AlmeidMa
 */
public class Exemplo2 {
    private int RA;
    private double ntP1, ntP2;
    private double ntTrab1, ntTrab2;
    
    public  void setRA( int regAluno){
        RA = regAluno;
    }
    public int getRA (){
        return RA;
    }
    
    public void setntP1(double P1){
        ntP1 = P1;
    }
    public double getntP1(){
        return ntP1;
    }
    public void setntP2(double P2){
        ntP2 = P2;
    }
    public double getntP2(){
        return ntP2;
    }
    
    public void setntTrab1(double T1){
        ntTrab1 = T1;
    }
    public double getntTrab1(){
        return ntTrab1;
    }
     public void setntTrab2(double T2){
        ntTrab2 = T2;
    }
    public double getntTrab2(){
        return ntTrab2;
    }  
    public double calcMediaProva(){
        double mediaProva = 0.75*(ntP1 + 2* ntP2)/3;
        return (mediaProva);
    }
     public double calcMediaTrab(){
       double mediaTrab = 0.25*(ntTrab1 + ntTrab2)/2;
        return (mediaTrab);
    }
     
    public double calcMediaFinal(){
        return (calcMediaProva()+calcMediaTrab());
    }
}
