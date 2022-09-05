package Aula04;

public class Caneta04 {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta04(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }
        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public float getPonta() {
            return ponta;
        }

        public void setPonta(float ponta) {
            this.ponta = ponta;
        }
        public void tampar(){
            this.tampada = true;
        }
        public void destampar(){
            this.tampada = false;
        }

        public void status(){
            System.out.println("Sobre a caneta: ");
            System.out.println("Modelo: " + this.getModelo());
            System.out.println("Ponta: " + this.getPonta());
            System.out.println("Cor: " + this.cor);
            System.out.println("Tampada: " + this.tampada);
        }

}