package carwashsystem;

import javax.swing.JOptionPane;

public class Carro {
    String marca;
    String modelo;
    String cor;
    String placa;
    String ano;
    
    public Carro(String marca, String modelo, String cor, String placa, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
    }
    public void infos() {
        JOptionPane.showMessageDialog(null, 
        "Marca: " + this.marca + 
        "\nModelo: " + this.modelo + 
        "\nCor: " + this.cor + 
        "\nPlaca: " + this.placa + 
        "\nAno: " + this.ano);
    }
    public String exibirVeiculo(){
        return " Marca: " + this.marca + 
        " Modelo: " + this.modelo + 
        " Cor: " + this.cor + 
        " Placa: " + this.placa + 
        " Ano: " + this.ano;
    }
}
