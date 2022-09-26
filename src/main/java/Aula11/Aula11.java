package Aula11;

public class Aula11 {

    public static void main(String[] args) {
      //Pessoa p1 = new Pessoa(); Tentando instanciar um objeto de uma classe abstract

     /*herança de implementação/pobre
      herda tudo da superclasse msm nao implementando nada
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        //herança pora diferença
        //Aluno é uma especialização de Pessoa e Pessoa é uma generalização de Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade(); //metodo sobreposto

    }

}

