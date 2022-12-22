package Ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Crear un objeto Hashmap con nuestros pares de palabras
		HashMap<String, String> electronicos = new HashMap<String, String>();
		
		// Agregamos llaves y valores
		electronicos.put("Computadora", "Computer");
		electronicos.put("Celular", "Cellphone");
		electronicos.put("Telefono", "Phone");
		electronicos.put("Bocina", "Speaker");
		electronicos.put("Lampara", "Lamp");
		electronicos.put("Tableta", "Tablet");
		electronicos.put("Bateria", "Battery");
		electronicos.put("Disco Duro", "Hard Drive");
		electronicos.put("Secadora", "Dryer");
		electronicos.put("Plancha", "Iron");
//		System.out.println(electronicos);
		
		System.out.println("- Bienvenido al diccionario -");
		System.out.println("Puedes traducir hasta 5 palabras Gratis");
		Scanner scanner = new Scanner(System.in);
		
		int a = 1;
		do {
			System.out.println("Introduce la palabra en espanol:");
			String electronico = scanner.next();
			
			if (electronicos.containsKey(electronico)) {
				System.out.println("La traduccion de "+ electronico + " es: " + electronicos.get(electronico)+"\n");
			} else {
				System.out.println("La palabra no se encuentra en el diccionario\n");
			}
			a++;
		} while (a<=5);
		
		System.out.println("\nGracias por utilizar el diccionario");
		scanner.close();
	}

}
