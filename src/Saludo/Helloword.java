package Saludo;

import java.util.Scanner;

public class Helloword {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int edad;
		String nombre;
		System.out.println("dime tu nombr: ");
		nombre = scanner.next();
		
		System.out.println("Tu nombre es: " + nombre);
		
		
	}

}
