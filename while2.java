package ejercicio_while2;

import java.util.Scanner;

public class while2 {
	 public static void main(String[] args) {
		 // Generamos un numero aleatorio
		 int number = (int)(Math.random() * 21);
					 Scanner input = new Scanner(System.in);
					 System.out.println("Adivina que numero pienso , entre el 0 y el 20");
		 int guess = -1;
		 while (guess != number) {
					 // Pedimos el numero al usuario
					 System.out.print("\nIngresa tu opcion: ");
					 guess = input.nextInt();
					 if (guess == number)
								 System.out.println("Si!!, el numero es: " + number);
					 else if (guess > number)
								 System.out.println("Estas muy por encima");
					 else
								 System.out.println("Estas muy por debajo");
		 // Fin del ciclo
		 }
}
}
