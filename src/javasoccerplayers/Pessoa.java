package javasoccerplayers;

abstract class Pessoa {

    private String nome;
    private int anoNasc;
    private int idade;
    private double altura;
    private double peso;
    protected double salario;

    public Pessoa(String nome, int anoNasc, int idade, double altura, double peso, double salario) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularIdade(int anoAtual) {
        this.setIdade(anoAtual - this.anoNasc);
    }
}
