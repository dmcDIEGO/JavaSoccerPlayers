package javasoccerplayers;

public class Jogador extends Pessoa {

    private String nomeCamisa;
    private String posicaoJoga;
    private int numGolCarreira;
    
    public Jogador(String nomeCamisa, String posicaoJoga, int numGolCarreira, String nome, int anoNasc, int idade, double altura, double peso, double salario) {
        super(nome, anoNasc, idade, altura, peso, salario);
        this.nomeCamisa = nomeCamisa;
        this.posicaoJoga = posicaoJoga;
        this.numGolCarreira = numGolCarreira;
    }

    public String getNomeCamisa() {
        return nomeCamisa;
    }

    public void setNomeCamisa(String nomeCamisa) {
        this.nomeCamisa = nomeCamisa;
    }

    public String getPosicaoJoga() {
        return posicaoJoga;
    }

    public void setPosicaoJoga(String posicaoJoga) {
        this.posicaoJoga = posicaoJoga;
    }

    public int getNumGolCarreira() {
        return numGolCarreira;
    }

    public void setNumGolCarreira(int numGolCarreira) {
        this.numGolCarreira = numGolCarreira;
    }

    public void calcularSalario(double salarioBase, double bonus) {
        double calcSalario = salarioBase + 5 * bonus;
        setSalario(calcSalario);
    }

    public void mostrarDados() {
        System.out.println("-----------------------------------------------");
        double bonus = 5000;
        int anoAtual = 2023;
        calcularIdade(anoAtual);
        System.out.println("Nome: " + getNome());
        System.out.println("Ano nascimento: " + getAnoNasc());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Nome na camisa: " + getNomeCamisa());
        System.out.println("Posicao do jogador: " + getPosicaoJoga());
        System.out.println("Numeros de gols na carreira: " + getNumGolCarreira());
        System.out.println("Salario base: " + getSalario());
        System.out.println("Bonus: " + bonus);
        calcularSalario(getSalario(), bonus);
        System.out.println("Salario + Bonus: " + getSalario());
        System.out.println("-----------------------------------------------");
    }

}
