import javax.naming.PartialResultException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        while (true) {
            System.out.println("\nSelecciona alguna operacion");
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("5- Salir");

            int operacion = obtenerEntero(sc);

            switch (operacion) {
                case 1:
                    int[] numerosSuma = leernumeros(sc, "sumar");
                    System.out.println("resultado de la suma:" + calculadora.sumar(numerosSuma));

                    break;

                case 2:
                    int[] numerosResta = leernumeros(sc, "restar");
                    System.out.println("resultado de la resta:" + calculadora.resta(numerosResta));

                    break;

                case 3:

                    int[] arrayMult = leernumeros(sc, "multiplicar");
                    System.out.println("resultado de la multiplicacion:" + calculadora.multiplicacion(arrayMult));

                    break;

                case 4:

                    int[] arrayDiv = leernumeros(sc, "dividir");
                    DecimalFormat df = new DecimalFormat("#.##########");
                    System.out.println("resultado de la division:" + calculadora.division(arrayDiv));

                    break;

                case 5:

                    System.out.println("saliendo del programa....");
                    sc.close();
                    return;

                default:


                    System.out.println("Opción inválida.");

            }
        }
    }

    public static int[] leernumeros(Scanner sc, String operacion ) {
        int cantidad;

        do {
            System.out.println("¿Cuántos números desea " + operacion + "? (Debe ser mayor que 0)");
            cantidad = obtenerEntero(sc);
            if (cantidad <= 0) {
                System.out.println("Error: Debe ingresar un número mayor que 0.");
            }
        } while (cantidad <= 0);

        int[] array = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese el (" + (i + 1) + ") numero");
            array[i] = sc.nextInt();
        }
        return array;

    }

    public static int obtenerEntero(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt(); // Permite cualquier número entero
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.next(); // Limpiar el buffer del scanner
            }
        }
    }





}