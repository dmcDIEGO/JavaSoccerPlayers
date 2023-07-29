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
        
                Tecnico tecnico2 = new Tecnico(
                "Felipão",
                35,
                2,
                "Luíz Felipe Scolari",
                1953,
                71,
                1.62,
                90,
                50.000);
        tecnico2.mostrarDados();
        

        Jogador jogador1 = new Jogador(
                "DUDU",
                "Ponta",
                200,
                "Eduardo Silva",
                1992,
                29,
                1.60,
                70,
                2.000);
        jogador1.mostrarDados();
        
        Jogador jogador2 = new Jogador(
                "São Marcos",
                "Goleiro",
                1,
                "Marcos Reis",
                1975,
                48,
                1.60,
                70,
                10.000);
        jogador2.mostrarDados();


    }
    
}
