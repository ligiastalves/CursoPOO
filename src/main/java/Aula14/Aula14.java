package Aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M","juba", 10);
        g[1] = new Gafanhoto("Creuza", 12, "F","creuzita", 6);

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
