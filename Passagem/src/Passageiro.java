
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
public class Passageiro {
    private String NomePassageiro;
    private String Telefone;
    private String Rg;
    private String LocalViagem;
    private String Data;
    private String Horario;
    private String Numpoltrona;

    public Passageiro() {
        this("","","","","","","");
    }

    public Passageiro(String NomePassageiro, String Telefone, String Rg, String LocalViagem, String Data, String Horario, String Numpoltrona) {
        this.NomePassageiro = NomePassageiro;
        this.Telefone = Telefone;
        this.Rg = Rg;
        this.LocalViagem = LocalViagem;
        this.Data = Data;
        this.Horario = Horario;
        this.Numpoltrona = Numpoltrona;
    }

    public String getNomePassageiro() {
        return NomePassageiro;
    }

    public void setNomePassageiro(String NomePassageiro) {
        this.NomePassageiro = NomePassageiro;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getLocalViagem() {
        return LocalViagem;
    }

    public void setLocalViagem(String LocalViagem) {
        this.LocalViagem = LocalViagem;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getNumpoltrona() {
        return Numpoltrona;
    }

    public void setNumpoltrona(String Numpoltrona) {
        this.Numpoltrona = Numpoltrona;
    }
    
    public void CadastrarDadosPassageiros(){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Nome do passageiro: ");
        setNomePassageiro(Ler.next());
        System.out.println("Telefone: ");
        setTelefone(Ler.next());
        System.out.println("RG: ");
        setRg(Ler.next());
}
    public void CadastrarDadosPassagem(){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Local da Viagem: ");
        setLocalViagem(Ler.next());
        System.out.println("Data: ");
        setData(Ler.next());
        System.out.println("Horário: ");
        setHorario(Ler.next());
        System.out.println("Número da Poltrona: ");
        setNumpoltrona(Ler.next());
        
    }
    
    public void mostrarDadosPassageiro(){
        System.out.println("Dados do Passageiro " + 
                "\n Nome: " + getNomePassageiro() + 
                "\n Telefone: " + getTelefone() + 
                "\n RG: " + getRg());
    }
    
    public void mostrarDadosPassagem(){
        System.out.println("Dados da Passagem" +
                "\n Local da Viagem: " + getLocalViagem() +
                "\n Data: " + getData() + 
                "\n Horário: " + getHorario() +
                "\n Número Poltrona: " + getNumpoltrona());
    }
    

    
    
    
    
}
