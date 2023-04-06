
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
public class Quadrado {
    private Double numero;
    private Double resultado;

    public Quadrado() {
        this(0.0,0.0);
    }

    public Quadrado(Double numero, Double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularquadrado(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        setNumero(ler.nextDouble());
        
        resultado=numero*numero;
        
    }
    
    public String mostrarQuadrado(){
        return "O quadrado deste numero é: " + getResultado();
    }
    
}
