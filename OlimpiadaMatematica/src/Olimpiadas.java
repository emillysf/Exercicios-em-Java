
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
public class Olimpiadas {
    private String nome;
    private String endereco;
    private Double media;
    private Double notaMenor;
    private Double notaMaior;

    public Olimpiadas() {
        this("","",0.0,0.0,0.0);
    }

    public Olimpiadas(String nome, String endereco, Double media, Double notaMenor, Double notaMaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notaMenor = notaMenor;
        this.notaMaior = notaMaior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getNotaMenor() {
        return notaMenor;
    }

    public void setNotaMenor(Double notaMenor) {
        this.notaMenor = notaMenor;
    }

    public Double getNotaMaior() {
        return notaMaior;
    }

    public void setNotaMaior(Double notaMaior) {
        this.notaMaior = notaMaior;
    }
    
    public void calcularMedia(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        setNome(ler.next());
        System.out.println("Digite o endereço: ");
        setEndereco(ler.next());
        System.out.println("Digite a nota maior: ");
        setNotaMaior(ler.nextDouble());
        System.out.println("Digite a nota menor: ");
        setNotaMenor(ler.nextDouble());
        
        setMedia((getNotaMaior()+getNotaMenor())/2);
    }
    public void verificarMedia(){
        if(getMedia()>9){
            System.out.println("Aluno inscrito \n Nome: " + getNome() +
            "\n Endereço: " + getEndereco());
            
        }else {
            System.out.println("Média Insuficiente");
        }
    }
}
