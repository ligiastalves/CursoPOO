package Aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta04 c1 = new Caneta04("Nic", "Vermelha", 0.7f);
        c1.status();
        /*c1.setModelo("Bic");
        //c1.modelo = "Bic";

        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
        Caneta04 c2 = new Caneta04("kkk", "preta", 0.9f);
        c2.status();

    }
}