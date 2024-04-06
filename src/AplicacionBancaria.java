import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        Scanner in = new Scanner(System.in);
        int opcionMenu = 0;

        String introduccion = """
                ******************************************
                                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %s$
                                
                ******************************************
                """.formatted(nombre, tipoDeCuenta, saldoDisponible);

        System.out.println(introduccion);

        while (opcionMenu != 9) {
            System.out.println("""
                    ** Escribe el número de opción deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            opcionMenu = in.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double valorRetirar = in.nextDouble();

                    if (valorRetirar < 0) {
                        System.out.println("Ingresa una cantidad válida.");
                        break;
                    }

                    if (valorRetirar > saldoDisponible) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldoDisponible -= valorRetirar;
                        System.out.println("Saldo restante: " + saldoDisponible + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que vas a depositar?");
                    double valorDepositar = in.nextDouble();

                    if (valorDepositar < 0) {
                        System.out.println("Ingresa una cantidad válida.");
                        break;
                    }

                    saldoDisponible += valorDepositar;
                    System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Ingresa una opción válida.");
                    break;
            }

        }
    }
}
