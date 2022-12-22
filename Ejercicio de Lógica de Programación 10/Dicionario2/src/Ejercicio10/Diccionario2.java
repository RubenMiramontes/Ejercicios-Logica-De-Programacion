package Ejercicio10;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario2 {

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
		electronicos.put("Reloj", "Watch");
		electronicos.put("Control de Tv", "Remote");
		electronicos.put("Camara", "Camera");
		electronicos.put("Audifonos", "Headphones");
		electronicos.put("Television", "TV");
		electronicos.put("Escaner", "Scanner");
		electronicos.put("Impresora", "Printer");
		electronicos.put("Calculadora", "Calculator");
		electronicos.put("Proyector", "Projector");
		electronicos.put("Cargador", "Charger");
//		System.out.println(electronicos);
		
		int aciertos = 0;
		int errores = 0;
		Scanner scanner = new Scanner(System.in);
		// Hacemos un arreglo de objetos
		Object[] keyArray = electronicos.keySet().toArray();
		for (int i=0; i<5; i++) { // Ciclo For para que nos de 5 palabras
			Object key = keyArray[new Random().nextInt(keyArray.length)]; // Elegimos una palabra random del HashMap
			System.out.println("Dime la traduccion en ingles de: " + key);
			String electronico = scanner.next(); // Usuario introduce traduccion
			if (electronico.contains(electronicos.get(key))) { // Verifica si es igual a la palabra random
				aciertos++; // Contador de aciertos
			} else {
				errores++; // Contador de errores
			} 
		}
		System.out.println("El total de aciertos es " + aciertos + " y total de errores es " + errores);

		scanner.close();
	}

}
