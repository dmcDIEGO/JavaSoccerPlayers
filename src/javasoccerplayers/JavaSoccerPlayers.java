package javasoccerplayers;

public class JavaSoccerPlayers {

    public static void main(String[] args) {
        Tecnico tecnico1 = new Tecnico(
                "Abel",
                5,
                2,
                "Abel Ferreira",
                1980,
                43,
                1.75,
                78,
                20.000);
        tecnico1.mostrarDados();

//        Tecnico tecnico2 = new Tecnico("Felipao", 30, 1, 1000, 10, "Luiz Felipe Scolari", 1953, 43, 1.65, 90, 10000);
//        tecnico2.mostrarDados();
        Jogador jogador1 = new Jogador(
                "DUDU",
                "Ponta",
                200,
                "Eduardo Silva",
                1992,
                29,
                1.60,
                70,
                500);
        jogador1.mostrarDados();

//        Jogador jogador2 = new Jogador("Veiga", "Meia", 150, 800, 70, "Rafael Veiga", 1995, 27, 1.72, 78, 400);
//        jogador2.mostrarDados();
    }
    
}
