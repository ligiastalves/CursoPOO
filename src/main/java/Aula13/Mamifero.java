package Aula13;

public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    protected void emitirSom() {
        System.out.println("Som de Mamifero");

    }
}
