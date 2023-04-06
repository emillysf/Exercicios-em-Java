
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
public class MediaMatematica {
    private Double numero1;
    private Double numero2;
    private Double media;
    private String nome;

    public MediaMatematica() {
        this(0.0,0.0,0.0,"");
    }

    public MediaMatematica(Double numero1, Double numero2, Double media, String nome) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.media = media;
        this.nome = nome;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calcularMedia(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        setNumero1(ler.nextDouble());
        System.out.println("Digite o segundo número: ");
        setNumero2(ler.nextDouble());
        System.out.println("Nome: ");
        setNome(ler.next());
        System.out.println("\n-----\n");
        media = (numero1+numero2)/2;
        
        System.out.println(nome + ", sua media é " + media);
    }
    
    
}
