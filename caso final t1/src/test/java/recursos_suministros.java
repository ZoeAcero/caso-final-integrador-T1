import java.util.Scanner;

public class recursos_suministros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Gestor de Recursos");
        System.out.println("Ingrese el nivel inicial de agua (en litros): ");
        double nivelAgua = scanner.nextDouble();

        System.out.println("Ingrese el nivel inicial de alimentos (en kilogramos): ");
        double nivelAlimentos = scanner.nextDouble();

        double[] proyeccionAgua = calcularProyeccionDeRecursos(nivelAgua, 5); // Proyección para los próximos 5 días
        double[] proyeccionAlimentos = calcularProyeccionDeRecursos(nivelAlimentos, 5);

        verificarNivelesSeguros(proyeccionAgua, proyeccionAlimentos);

        mostrarEstadisticas(proyeccionAgua, proyeccionAlimentos);

        scanner.close();
    }

    private static double[] calcularProyeccionDeRecursos(double nivelInicial, int dias) {
        double[] proyeccion = new double[dias];
        for (int i = 0; i < dias; i++) {
            proyeccion[i] = nivelInicial - (i + 1) * 2; // Consumo de 2 unidades por día
        }
        return proyeccion;
}
