package Aula14;

import lombok.Getter;
import lombok.Setter;

public class Visualizacao {
    @Getter
    @Setter
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido((this.espectador.getTotAssistido() + 1));
        this.filme.setViews(filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if (porc <=50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
