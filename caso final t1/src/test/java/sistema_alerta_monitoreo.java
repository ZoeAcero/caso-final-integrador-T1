import java.util.Scanner;
public class sistema_alerta_monitoreo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Alerta y Monitoreo");

        // Monitoreo constante de variables ambientales
        monitorearVariablesAmbientales();

        scanner.close();
    }
}
