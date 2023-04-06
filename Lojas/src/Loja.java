
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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private Double valorCompra;
    private Double qtdItensComp;
    private Double valorTotalCompra;

    public Loja() {
        this("","",0.0,0.0,0.0);
    }

    public Loja(String razaoSocial, String cpfCliente, Double valorCompra, Double qtdItensComp, Double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(Double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public Double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(Double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a razao: ");
        setRazaoSocial(ler.next());
        System.out.println("Digite o CPF: ");
        setCpfCliente(ler.next());
        System.out.println("Digite o valor da compra: ");
        setValorCompra(ler.nextDouble());
        System.out.println("Digite a quantidade de itens: ");
        setQtdItensComp(ler.nextDouble());
        
    }
     public String mostrarDadosLoja(){
         return "Razão social: " + getRazaoSocial() 
                 + "\n CPF:  " + getCpfCliente() 
                 + "\n Valor: " + getValorCompra()
                 + "\n Quantidade: " + getQtdItensComp();
     }
    
     public double calcularCompraLoja(){
         valorTotalCompra = valorCompra * qtdItensComp;
         
         return getValorTotalCompra();
     }
}
