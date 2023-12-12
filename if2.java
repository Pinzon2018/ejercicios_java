package ejercicio_if2;

import java.util.Scanner;

public class if2 {

	  public static void main(String[] args) {
		    Scanner scanner = new Scanner (System.in);
		    int numero;
		// Solicitud de datos al usuario
		    System.out.println("Este programa calcula si un número es par o impar.");
		    System.out.print("Introduce el número: ");
		    numero = scanner.nextInt();
		    
		// Realizamos Cálculos y mostramos en pantalla
		    if (numero % 2 == 0){
		        System.out.println("El número, " +numero + " es par.");
		    }else {
		        System.out.println("El número " +numero + " es impar.");
		    }  
		  }

}
