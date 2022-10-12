package Aula12;

public class Canguru extends Mamifero{

    public void usarBolsar(){
        System.out.println("Usando Bolsa");
    }

    @Override
    public void locomover() {
         System.out.println("Saltando");
    }
}
