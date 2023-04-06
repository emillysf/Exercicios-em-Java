
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
public class Fornecedor {
    private String NomeFornecedor;
    private String NomeProduto;
    private String DescProduto;

    public Fornecedor() {
        this("","","");
    }

    public Fornecedor(String NomeFornecedor, String NomeProduto, String DescProduto) {
        this.NomeFornecedor = NomeFornecedor;
        this.NomeProduto = NomeProduto;
        this.DescProduto = DescProduto;
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getDescProduto() {
        return DescProduto;
    }

    public void setDescProduto(String DescProduto) {
        this.DescProduto = DescProduto;
    }
    
    public void cadastrarFornecedor(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome do Fornecedor: ");
        setNomeFornecedor(ler.next());
        System.out.println("Nome do Produto: ");
        setNomeProduto(ler.next());
        System.out.println("Descrição do Produto: ");
        setDescProduto(ler.next());
        
    }
    
    public void listarFornecedor(){
            System.out.println("Lista Fornecedor " +
                    "\n Nome: " + getNomeFornecedor() + 
                    "\n Produto: " + getNomeProduto() +
                    "\n Descrição: " + getDescProduto());
    }
    
    
}
