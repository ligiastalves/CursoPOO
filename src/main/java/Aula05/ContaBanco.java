package Aula05;

public class ContaBanco {

     public int numConta;
     protected String tipo;
     private String dono;
     private float saldo;
     private boolean status;

    public void estadoAtual(){
        System.out.println("______________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
     //metodo construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //metodos especiais
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
           this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso ");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            //sacar();
            System.out.println("Conta com dinheiro. Não pode ser fechada!");
        }else if (this.getSaldo() < 0){
            //depositar();
            System.out.println("Conta em débito. Não pode ser fechada. ");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso ");
        }

    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
        }else{
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        }else{
            System.out.println("impossivel pagar uma conta fechada ");
        }
    }

}
