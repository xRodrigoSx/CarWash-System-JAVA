package carwashsystem;

import javax.swing.JOptionPane;

public class Cliente {

    String nome;
    String sobrenome;
    String sexo;
    String endereco;
    String telefone;
    String datanascimento;
    Agendamento agendamentos;
    Carro veículo;
    int plano = 0;

    public Cliente() {
        this.nome = "";
        this.sobrenome = "";
        this.sexo = "";
        this.endereco = "";
        this.telefone = "";
        this.datanascimento = "";
    }

    public Cliente(String nome, String sobrenome, String sexo, String endereco, String telefone, String datanascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.datanascimento = datanascimento;
        this.veículo = null;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setcar(Carro car) {
        this.veículo = car;
    }
    
    public void setagenda(Agendamento agendamento) {
        this.agendamentos = agendamento;
    }

    public Carro getcar() {
        return this.veículo;
    }

    public String getInfosCliente() {
        return "Nome: " + this.nome
                + " Sobrenome: " + this.sobrenome
                + " Sexo: " + this.sexo
                + " Endereço: " + this.endereco
                + " Telefone: " + this.telefone
                + " Data de nascimento: " + this.datanascimento
                + " Plano: " + this.plano;
    }

    public String getInfosVeículo() {
        return "Nome: " + this.nome
                + " Sobrenome: " + this.sobrenome
                + " Sexo: " + this.sexo
                + " Endereço: " + this.endereco
                + " Telefone: " + this.telefone
                + " Data de nascimento: " + this.datanascimento
                + " Carro: " + this.veículo.exibirVeiculo()
                + " Plano: " + this.plano;
    }
    public String getInfosAgenda() {
        return this.agendamentos.exibirAgendamento();
    }
    public void infos() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.nome
                + "\nSobrenome: " + this.sobrenome
                + "\nSexo: " + this.sexo
                + "\nEndereço: " + this.endereco
                + "\nTelefone: " + this.telefone
                + "\nData de nascimento: " + this.datanascimento
                + "\nPlano: " + this.plano);
    }
}
