/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Loja lo = new Loja();
       
       lo.inserirDadosLoja();
        System.out.println(lo.mostrarDadosLoja());
        System.out.println("O valor total da compra é: R$ " 
                + lo.calcularCompraLoja());
    }
    
}
