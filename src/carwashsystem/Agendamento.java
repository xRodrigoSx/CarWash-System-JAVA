package carwashsystem;

import javax.swing.JOptionPane;

public class Agendamento {
    String placa;
    String data;
    String horario;
            
public Agendamento(String placa, String data, String horario){
    this.placa = placa;
    this.data = data;
    this.horario = horario;
}
public void infos() {
        JOptionPane.showMessageDialog(null, 
        "Placa do veículo: " + this.placa + 
        "\nData da lavagem: " + this.data + 
        "\nHorário da lavagem: " + this.horario);
    }
public String exibirAgendamento(){
        return "Placa do veículo: " + this.placa + 
        " Data da lavagem: " + this.data + 
        " Horário da lavagem: " + this.horario;
}
}
