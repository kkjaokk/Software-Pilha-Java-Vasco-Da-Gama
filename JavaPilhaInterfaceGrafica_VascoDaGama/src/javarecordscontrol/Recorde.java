package javarecordscontrol;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Recorde {
        private LocalDate dataRecorde;
        private String nome;
        private double tempo;
        
        
    public Recorde(String nome, LocalDate dataRecorde,  double tempo) {
        this.dataRecorde = dataRecorde;
        this.nome = nome;
        this.tempo = tempo;
    }
    
    public Recorde(){
        
    }

    public LocalDate getDataRecorde() {
        return dataRecorde;
    }

    public void setDataRecorde(LocalDate dataRecorde) {
        this.dataRecorde = dataRecorde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }
 
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public String toString() {
     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate dataTeste = dataRecorde;
    return "Nome do Jogador: " + nome + ", \nData do Record: " + format.format(dataTeste) + ", \nTempo: " + tempo + " segundos"+"\n-----------------------------------------------";
}
            

}
