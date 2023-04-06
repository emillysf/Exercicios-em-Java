
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Cliente {
    private String Nome;
    private String End;
    private String RG;

    public Cliente() {
        this("","","");
    }

    public Cliente(String Nome, String End, String RG) {
        this.Nome = Nome;
        this.End = End;
        this.RG = RG;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String End) {
        this.End = End;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

   public void cadastrarCliente(){
       Scanner leia = new Scanner(System.in);
       System.out.println("Nome: ");
       setNome(leia.next());
       System.out.println("Endereço: ");
       setEnd(leia.next());
       System.out.println("RG: ");
       setRG(leia.next());
   }
   
   public void listarCliente(){
       System.out.println("Cliente " + 
               "\n Nome: " + getNome() +
               "\n Endereço: " + getEnd() +
               "\n RG: " + getRG());
   }
   
   
    
}
