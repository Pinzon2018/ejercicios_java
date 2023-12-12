package suma;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		int num1, num2, result;
		Scanner pccc = new Scanner(System.in); 
		System.out.println("Cual es el primer numero: ");
		num1 = pccc.nextInt();
		System.out.println("Cual es su segundo numero: ");
		num2 = pccc.nextInt();
	
		result = num1+num2;
	
		System.out.println("El resultado es: "+result);
	}

}
