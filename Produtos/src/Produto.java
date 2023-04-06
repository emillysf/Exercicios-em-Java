
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
public class Produto {
    private String Nome;
    private int Qtde;
    private Double Valor;
    private Double Total;

    public Produto() {
        this("",0,0.0,0.0);
    }

    public Produto(String Nome, int Qtde, Double Valor, Double Total) {
        this.Nome = Nome;
        this.Qtde = Qtde;
        this.Valor = Valor;
        this.Total = Total;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQtde() {
        return Qtde;
    }

    public void setQtde(int Qtde) {
        this.Qtde = Qtde;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    public void calcularTotal(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        setNome(ler.next());
        System.out.println("Quantidade: ");
        setQtde(ler.nextInt());
        System.out.println("Valor: ");
        setValor(ler.nextDouble());
        
        Total = Valor*Qtde;
        
        System.out.println("O valor total é " + Total);
    }
    
    
    
    
}
