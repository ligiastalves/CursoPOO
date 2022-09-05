package Aula07;

//UEC = Ultra Emoji Combat
    public class Lutador {

        //atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private float altura;
        private float peso;
        private String categoria;
        private int vitorias;
        private int derrotas;
        private int empates;

        //construtor
        public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
            this.nome = no;
            this.nacionalidade = na;
            this.idade = id;
            this.altura = al;
            this.setPeso(pe);
            this.vitorias = vi;
            this.derrotas = de;
            this.empates = em;
        }

        //personalizados
        public void apresentar() {
            System.out.println("___________________________");
            System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getNome());
            System.out.println("Diretamente de " + this.getNacionalidade());
            System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m");
            System.out.println("Pesando " + this.getPeso() + "Kg");
            System.out.println(this.getVitorias() + " vitórias");
            System.out.println(this.getDerrotas() + " derrotas e ");
            System.out.println(this.getEmpates() + " empates!");
        }
        public void status(){
            System.out.println(this.getNome() + "é um peso " + this.getCategoria());
            System.out.println("Ganhou " + this.getVitorias() + " vezes");
            System.out.println("Perdeu " + this.getDerrotas() + " vezes");
            System.out.println("Empatou " + this.getEmpates() + " vezes");

        }
        public void ganharLuta(){
            this.setVitorias(this.getVitorias() + 1);
        }
        public void perdeLuta(){
            this.setDerrotas(this.getDerrotas() + 1);
        }
        public void empatarLuta(){
            this.setEmpates(this.getEmpates() + 1);
        }

        //especiais
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNacionalidade() {
            return nacionalidade;
        }

        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) {
            this.peso = peso;
            this.setCategoria();
        }

        public String getCategoria() {
            return categoria;
        }

        //metodo interno
        private void setCategoria() {
            if(this.peso < 52.2){
                this.categoria = "Invalido";
            }else if(this.peso <= 70.3){
                this.categoria = "Leve";
            }else if(this.peso <= 83.9){
                this.categoria = "Médio";
            }else if(this.peso <= 120.2){
                this.categoria = "Pesado";
            }else{
                this.categoria = "Invalido";
            }
        }

        public int getVitorias() {
            return vitorias;
        }

        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

        public int getDerrotas() {
            return derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

        public int getEmpates() {
            return empates;
        }

        public void setEmpates(int empate) {
            this.empates = empate;
        }
    }



