package Aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("Cinza");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.setCorPena("Vermelha");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsar();

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.setCorPelo("Caramelo");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();

    }
}

