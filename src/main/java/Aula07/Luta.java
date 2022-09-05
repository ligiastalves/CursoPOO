package Aula07;

import java.util.Random;

/*UEC = Ultra Emoji Combat
 Regras da luta
 Só pode ser marcada entre lutadores da mesma categoria.
 Desafiado e desagiante devem ser lutadores diferentes.
 A luta só pode acontecer se estiver aprovada
 Só pode ter como resultado a vitoriade um dos lutadores ou o empate.
  */
public class Luta {

    //atributos / instanciando um objeto de outra classe, agregação
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            System.out.println("=============================");
            int vencedor  = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor){
                case 0: // empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perdeLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perdeLuta();
                    break;
            }
            System.out.println("=============================");
        }else{
            System.out.println("A luta não pode acontecer! ");
        }
    }
    //especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
