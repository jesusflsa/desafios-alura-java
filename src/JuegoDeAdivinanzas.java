import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

//        Imprime el número aleatorio en pantalla
//        System.out.println(numeroAleatorio);

        System.out.println("Bienvenido al juego de adivinanzas.");
        System.out.println("En este deberás adivinar el número que se generará de manera aleatoria en un rango entre 0 y 100.");
        System.out.println("Tendrás un máximo de 5 intentos para adivinar.");

        for (int i = 1; i <= 5; i++) {
            String palabraMayorMenor;
            String palabraComodin = "un";
            int cantidadIntentos = 5 - i;

            if (i != 1) palabraComodin = "otro";

            System.out.println("Ingresa " + palabraComodin + " número.");
            int intento = in.nextInt();

            if (numeroAleatorio == intento) {
                System.out.println("Felicidades, lograste adivinar el número.");
                break;
            } else if (i == 5) {
                System.out.println("Se te acabaron los intentos. El número que intentaste adivinar era: " + numeroAleatorio);
                break;
            }

            if (numeroAleatorio > intento) {
                palabraMayorMenor = "mayor";
            } else {
                palabraMayorMenor = "menor";
            }

            System.out.println("El número aleatorio es " + palabraMayorMenor + ". Te quedan " + cantidadIntentos + " intentos.");
        }
    }
}
