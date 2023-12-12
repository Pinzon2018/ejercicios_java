package porra;

import java.util.Scanner;

public class porra {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("                           JUEGO DE LA PORRA                                 ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("       Cada usurio debe elegir un numero y el primero en salir gana          ");
        System.out.println("             Y los que salgan despues de el ganador pierden                  ");
        System.out.println(" Cuando vayas a adivinar un numero tiene que ser diferente al que tu elegiste ");
        System.out.println("-----------------------------------------------------------------------------");

        int cantidadjugadores, numeroMaximo;
        do {
            System.out.print("Ingrese un número para generar una tabla (mayor a 23 y menor o igual a 50): ");
            numeroMaximo = scanner.nextInt();
            
            if (numeroMaximo <= 23 || numeroMaximo > 50) {
                System.out.println("Número inválido. Debe ser mayor a 23 y menor o igual a 50.");
            }
        } while (numeroMaximo <= 23 || numeroMaximo > 50);
        
        System.out.print("Cuantos jugadores: ");
        cantidadjugadores = scanner.nextInt();

        int[] numerosElegidos = new int[cantidadjugadores];
        boolean[] jugadoresActivos = new boolean[cantidadjugadores];
        boolean[] numerosTachados = new boolean[numeroMaximo + 1];
        int jugadoresRestantes = cantidadjugadores;

        for (int i = 0; i < cantidadjugadores; i++) {
            jugadoresActivos[i] = true;
        }

        for (int i = 0; i < cantidadjugadores; i++) {
            System.out.print("Jugador " + (i + 1) + ": Elija un número de la tabla (entre 1 y " + numeroMaximo + "): ");
            int numeroElegido;
            do {
                numeroElegido = scanner.nextInt();
                if (numeroElegido < 1 || numeroElegido > numeroMaximo) {
                    System.out.println("Número inválido. Debe ser entre 1 y " + numeroMaximo + ".");
                    System.out.print("Jugador " + (i + 1) + ": Elija un número de la tabla (entre 1 y " + numeroMaximo + "): ");
                } else if (numerosTachados[numeroElegido]) {
                    System.out.println("Número ya elegido por otro Jugador. Elija otro número.");
                    System.out.print("Jugador " + (i + 1) + ": Elija un número de la tabla (entre 1 y " + numeroMaximo + "): ");
                }
            } while (numeroElegido < 1 || numeroElegido > numeroMaximo || numerosTachados[numeroElegido]);
            numerosElegidos[i] = numeroElegido;
        }

        while (jugadoresRestantes > 1) {
        	
            System.out.println("Tabla actual:");
            for (int i = 1; i <= numeroMaximo; i++) {
                System.out.print((numerosTachados[i] ? "X" : i) + "\t");
                if (i % 5 == 0) {
                    System.out.println();
                }
            }

            for (int i = 0; i < cantidadjugadores; i++) {
                if (!jugadoresActivos[i]) {
                    continue; 
                }

                System.out.print("Jugador " + (i + 1) + ": Tache un número de la tabla: ");
                int numeroTachado;
                do {
                    numeroTachado = scanner.nextInt();
                    if (numeroTachado < 1 || numeroTachado > numeroMaximo || numerosTachados[numeroTachado]) {
                        System.out.println("Número inválido o ya tachado. Tache otro número.");
                        System.out.print("Jugador " + (i + 1) + ": Tache un número de la tabla: ");
                    }
                } while (numeroTachado < 1 || numeroTachado > numeroMaximo || numerosTachados[numeroTachado]);

                for (int j = 0; j < cantidadjugadores; j++) {
                    if (i != j && jugadoresActivos[j] && numerosElegidos[j] == numeroTachado) {
                        System.out.println("¡El Jugador " + (i + 1) + " ha adivinado el número del Jugador " + (j + 1) + "!");
                        jugadoresActivos[j] = false; 
                        jugadoresRestantes--;
                    }
                }

                numerosTachados[numeroTachado] = true;
            }
        }

        int ganador = 0;
        for (int i = 0; i < cantidadjugadores; i++) {
            if (jugadoresActivos[i]) {
                ganador = i + 1;
                break;
            }
        }

        System.out.println("¡El jugador " + ganador + " es el ganador!");

        scanner.close();
    }
}





