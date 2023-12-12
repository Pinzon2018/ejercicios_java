package ejercicio_for1;

public class EjemploForSumaPares {
    public static void main(String[] args) {
        int inicio = 1;
        int fin = 10;
        int sumaPares = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) { 
                sumaPares += i; 
            }
        }

        System.out.println("La suma de los números pares entre " + inicio + " y " + fin + " es: " + sumaPares);
    }
}