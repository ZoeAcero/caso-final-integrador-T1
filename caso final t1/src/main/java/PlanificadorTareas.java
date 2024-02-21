import java.util.Arrays;

public class PlanificadorTareas {

    public static void main(String[] args) {

        String[] tareas = {"Tarea A", "Tarea B", "Tarea C", "Tarea D", "Tarea E"};
        double[] rendimientoTripulacion = {0.9, 0.8, 0.95, 0.85, 0.92};


        double[] distribucionOptima = optimizarTareas(tareas.length, rendimientoTripulacion);
        mostrarHorarios(tareas, distribucionOptima);
    }


    private static double[] optimizarTareas(int numTareas, double[] rendimientoTripulacion) {
        // Inicialización de una distribución uniforme
        double[] distribucionInicial = new double[numTareas];
        Arrays.fill(distribucionInicial, 1.0 / numTareas);


        double[] distribucionOptima = new double[numTareas];
        for (int i = 0; i < numTareas; i++) {
            distribucionOptima[i] = distribucionInicial[i] * rendimientoTripulacion[i];
        }


        double suma = Arrays.stream(distribucionOptima).sum();
        for (int i = 0; i < numTareas; i++) {
            distribucionOptima[i] /= suma;
        }

        return distribucionOptima;
    }


    private static void mostrarHorarios(String[] tareas, double[] distribucionOptima) {
        System.out.println("Horario y Cargas de Trabajo Optimos:");

        for (int i = 0; i < tareas.length; i++) {
            System.out.println(tareas[i] + ": " + (int) (distribucionOptima[i] * 100) + "%");
        }
    }
}
