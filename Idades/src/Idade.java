
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
public class Idade {
 private int ano;
 private int idade;

    public Idade() {
        this(0,0);
    }

    public Idade(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public void calcularIdade(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        setAno(ler.nextInt());
        
        idade = 2023-ano;
    }
    
    public String mostrarIdade(){
        return "Sua idade é " + getIdade();
    
    }
 
}
