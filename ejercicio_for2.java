package ejercicio_for2;

public class ejercicio_for2 {
    public static void main(String[] args) {
        int n = 10;
        int primero = 0, segundo = 1;

        System.out.println("Serie de Fibonacci hasta el término " + n + ": ");

        for (int i = 1; i <= n; i++) {
            System.out.print(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}