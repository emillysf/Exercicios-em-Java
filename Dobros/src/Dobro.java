
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
public class Dobro {
    private Double numero;
    private Double calculo;

    public Dobro() {
        this(0.0,0.0);
    }
    
    

    public Dobro(Double numero, Double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getCalculo() {
        return calculo;
    }

    public void setCalculo(Double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        setNumero(ler.nextDouble());
        
        calculo = numero * 2;
        
        System.out.println("O dobro deste número é " + calculo);
    }

   
    

    
    
    
    
}
