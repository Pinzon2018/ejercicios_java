package ejercicio_if1;

import java.util.Scanner;

public class if1 {
	  public static void main(String[] args) {
		    Scanner scanner = new Scanner (System.in);
		    String cadena;
		// Solicitud de datos al usuario
		    System.out.println("Este programa nos pide una cadena y comprueba si es una letra mayúscula.");
		    System.out.print("Introduce la cadena que desees: ");
		    cadena = scanner.nextLine();
		    
		// Realizamos Cálculos y mostramos en pantalla
		    if (cadena.length() != 1){
		      System.out.println("La cadena no es una letra mayúscula");
		   // }else if ((cadena > "A") && (cadena < "Z")) {
		    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra mayúscula.");
		    }else {
		        System.out.println("La cadena no es una letra mayúscula.");
		    }
	  }
}
