import java.util.Arrays;

public class NavegadorEstelar {

    public static void main(String[] args) {

        int[][] terrenoPlaneta = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };


        planificarRutas(terrenoPlaneta);
    }

    private static void planificarRutas(int[][] terrenoPlaneta) {

        int[][] rutaOptima = encontrarRutaOptima(terrenoPlaneta);


        mostrarTerrenoConRuta(terrenoPlaneta, rutaOptima);
    }


    private static int[][] encontrarRutaOptima(int[][] terrenoPlaneta) {

        int[][] rutaOptima = new int[terrenoPlaneta.length][terrenoPlaneta[0].length];
        for (int i = 0; i < terrenoPlaneta.length; i++) {
            for (int j = 0; j < terrenoPlaneta[0].length; j++) {
                rutaOptima[i][j] = 1; // Ruta directa
            }
        }

        return rutaOptima;
    }


    private static void mostrarTerrenoConRuta(int[][] terrenoPlaneta, int[][] rutaOptima) {
        System.out.println("Terreno del Planeta con Ruta Óptima:");

        for (int i = 0; i < terrenoPlaneta.length; i++) {
            for (int j = 0; j < terrenoPlaneta[0].length; j++) {
                if (rutaOptima[i][j] == 1) {
                    System.out.print("X "); // Marcar la ruta óptima con "X"
                } else {
                    System.out.print(terrenoPlaneta[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
