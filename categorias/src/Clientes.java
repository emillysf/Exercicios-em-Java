
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
public class Clientes {
    private String nome;
    private Double numeroConta;
    private Double saldoMedio;

    public Clientes() {
        this("",0.0,0.0);
    }

    public Clientes(String nome, Double numeroConta, Double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(Double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        setNome(ler.next());
        System.out.println("Digite o numero da conta: ");
        setNumeroConta(ler.nextDouble());
        System.out.println("Digite o saldo médio");
        setSaldoMedio(ler.nextDouble());
        
        if(getSaldoMedio()<1000){
            System.out.println("Cliente Comum");
        } else if((getSaldoMedio()>=1000) && (getSaldoMedio()<2500)){
            System.out.println("Cliente Prata");
        } else if (getSaldoMedio()>= 2500){
            System.out.println("Cliente Ouro");
        }
    }
    
}
