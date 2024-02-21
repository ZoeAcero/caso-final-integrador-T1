import java.util.Scanner;

public class ComunicadorInterplanetario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");

        while (true) {
            System.out.println("\n1. Enviar mensaje");
            System.out.println("2. Recibir mensaje");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su mensaje: ");
                    String mensajeEnviado = scanner.nextLine();
                    String mensajeTraducido = traducirMensaje(mensajeEnviado);
                    System.out.println("Mensaje enviado: " + mensajeEnviado);
                    System.out.println("Mensaje traducido: " + mensajeTraducido);
                    break;
                case 2:
                    System.out.print("Ingrese el mensaje recibido: ");
                    String mensajeRecibido = scanner.nextLine();
                    boolean integridadVerificada = verificarIntegridad(mensajeRecibido);
                    if (integridadVerificada) {
                        System.out.println("La integridad del mensaje es válida.");
                    } else {
                        System.out.println("¡Alerta! La integridad del mensaje no es válida.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del Comunicador Interplanetario");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }
    }

    // Función para traducir un mensaje (ejemplo simple, puedes ajustar según tus necesidades)
    private static String traducirMensaje(String mensaje) {
        // Revertir el mensaje como ejemplo básico de traducción
        return new StringBuilder(mensaje).reverse().toString();
    }

    // Función para verificar la integridad de un mensaje (ejemplo simple, puedes ajustar según tus necesidades)
    private static boolean verificarIntegridad(String mensaje) {
        // Verificar si el mensaje es un palíndromo como ejemplo básico de integridad
        String mensajeLimpio = mensaje.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String mensajeRevertido = new StringBuilder(mensajeLimpio).reverse().toString();
        return mensajeLimpio.equals(mensajeRevertido);
    }
}

