import java.util.Scanner;
public class Cronometro_cosmico {

    private static double convertirTiempo(double tiempoTierra, double duracionDiaPlaneta, double duracionAnioPlaneta) {
        return tiempoTierra;
    }

    private static void identificarLimitesDeDatos() {
    }

    private static void visualizarTiempoEnFormatos(double tiempoPlaneta) {
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Cronómetro Cósmico");
        System.out.println("Ingrese la duración del día en el nuevo planeta (en horas): ");
        double duracionDiaPlaneta = scanner.nextDouble();

        System.out.println("Ingrese la duración del año en el nuevo planeta (en días): ");
        double duracionAnioPlaneta = scanner.nextDouble();

        System.out.println("Ingrese el tiempo en la Tierra (en días): ");
        double tiempoTierra = scanner.nextDouble();

        double tiempoPlaneta = convertirTiempo(tiempoTierra, duracionDiaPlaneta, duracionAnioPlaneta);
        System.out.println("El tiempo equivalente en el nuevo planeta es: " + tiempoPlaneta + " días");

        visualizarTiempoEnFormatos(tiempoPlaneta);

        identificarLimitesDeDatos();

        scanner.close();
    }



}
