package Aula13;

public class Aula13 {
    public static void main(String[] args) {
       //Lobo x = new Lobo();
       // x.emitirSom();

        Cachorro k = new Cachorro();
        k.emitirSom();

        k.reagir("Olá");
        k.reagir("Vai dormir!");
        k.reagir(11,45);
        k.reagir(19,00);

        k.reagir(true);
        k.reagir(false);
        k.reagir(2,12.5f);
        k.reagir(17,4.5f);
    }

}
