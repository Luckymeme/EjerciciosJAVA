package paquete;//CTRL+shift+F Eclipse

import java.util.Scanner;

public class Main {
	public static String removeExtrems(String str) {
		// Verificar si la cadena está vacía o tiene un solo carácter
		if (str == null || str.length() <= 1) {
			return "ERROR"; // Devolver cadena vacía en estos casos
		}
		// Retornar la cadena sin el primer y último carácter
		return str.substring(1, str.length() - 1);
	}

	public static void main(String[] args) {
		/*
		 * como resultado devuelva la cadena consistente en eliminar los caracteres
		 * primero y último de str
		 */
		// Haced un programa que pida un texto al usuario y muestre el texto sin los
		// extremos.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto = sc.nextLine();
		int x = texto.length();
		System.out.println(x);
		String resultado = removeExtrems(texto);
		System.out.println("Resultado: " + resultado);

		/*
		 * public int suma(int a, int b) { return a + b; // Este es el dato de salida }
		 * 
		 * public static void main(String[] args) { Main conyo = new Main(); int
		 * sumatorio = conyo.suma(7, 3); System.out.println("Hello World! " +
		 * sumatorio); }
		 */

	}

}