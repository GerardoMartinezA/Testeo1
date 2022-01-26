package Saludo;

import java.util.Scanner;

public class Helloword {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int edad;
		String Nombre;
		System.out.println("dime tu nombr: ");
		Nombre = scanner.next();
		
		System.out.println("Tu nombre es: " + Nombre);
		
		
	}

}
