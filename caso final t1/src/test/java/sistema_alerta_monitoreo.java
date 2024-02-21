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

            if (esNumeroPrimo(nivelCO2)) {
                System.out.println("¡Alerta! Nivel de CO2 inusualmente alto: " + nivelCO2);
            }

            if (temperatura > 35) {
                System.out.println("¡Alerta! Temperatura críticamente alta: " + temperatura);
            }

            try {
                Thread.sleep(5000);  // Pausa de 5 segundos entre monitoreos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


