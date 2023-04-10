package javasoccerplayers;

public class Tecnico extends Pessoa {

    private String apelido;
    private int anosExperiencia;
    private int tempoContrato;

    public Tecnico(String apelido, int anosExperiencia, int tempoContrato, String nome, int anoNasc, int idade, double altura, double peso, double salario) {
        super(nome, anoNasc, idade, altura, peso, salario);
        this.apelido = apelido;
        this.anosExperiencia = anosExperiencia;
        this.tempoContrato = tempoContrato;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    public void calcularSalario(double salarioBase, int horasExtras) {
        double calcSalario = getSalario() + 350.00 * horasExtras;
        setSalario(calcSalario);
    }

    public void mostrarDados() {
        System.out.println("-----------------------------------------------");
        int horasExtras = 20;
        int anoAtual = 2023;
        calcularIdade(anoAtual);
        System.out.println("Apelido: " + getApelido());
        System.out.println("Anos de esperiencia: " + getAnosExperiencia());
        System.out.println("Tempo de contrato: " + getTempoContrato());
        System.out.println("Nome: " + getNome());
        System.out.println("Ano nascimento: " + getAnoNasc());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Salario base: " + getSalario());
        System.out.println("Horas extras: " + horasExtras);
        calcularSalario(getSalario(), horasExtras);
        System.out.println("Salario calculado: " + getSalario());
        System.out.println("-----------------------------------------------");
    }

}
