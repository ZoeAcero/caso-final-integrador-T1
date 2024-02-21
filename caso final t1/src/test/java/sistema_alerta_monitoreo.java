import java.util.Scanner;
public class sistema_alerta_monitoreo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Alerta y Monitoreo");

        monitorearVariablesAmbientales();

        scanner.close();
    }

    private static void monitorearVariablesAmbientales() {
        while (true) {
            double temperatura = generarNumeroAleatorio(10, 40);
            int nivelCO2 = generarNumeroAleatorio(200, 1000);
}
