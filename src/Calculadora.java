public class Calculadora {

    public  int sumar(int[] array) {
        int suma = 0;

        for (int num : array) {
            suma = suma + num;
        }

        return suma;
    }

    public int resta(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }
        int resta = array[0];

        for (int i = 1; i < array.length; i++) {
            resta -= array[i];
        }

        return resta;
    }

    public int multiplicacion(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }
        int mult = 1;
        for (int num : numeros) {
            mult *= num;
        }
        return mult;
    }

    public double division(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }
        double div = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("Error: No se puede dividir por 0. La operación ha sido cancelada.");
                return Double.NaN;
            }
            div /= array[i];
        }

        return div;
    }
}
