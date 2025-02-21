package paquete;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

class Main {
	public static void main(String[] args) {
		ArrayList<Object[]> p = new ArrayList<>();
		rellenaArray(p);
		imprimirPlaneta(p);
		ArrayList<Planeta> nuevo = new ArrayList<>();
		int[] numeros = {1,2,3,3};
		System.out.println(numeros);

	}

//    public static void convertObjToPlanet(ArrayList<Object[]>datos,ArrayList<Planeta>Planetas) {
//        
//        nuevo.add( new planeta) 
		//// es una llamada a un método de instancia de un objeto.
//        
//    }
	public static void rellenaArray(ArrayList<Object[]> Planetas) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int masa;
		String color;
		int respuesta = 1;

		while (respuesta == 1) {
			System.out.println("Dime el nombre");
			nombre = sc.nextLine();
			System.out.println("Dime la masa");
			masa = sc.nextInt();
			sc.nextLine();
			System.out.println("Dime el color");
			color = sc.nextLine();
			Object planeta[] = new Object[3];
			planeta[0] = nombre;
			planeta[1] = masa;
			planeta[2] = color;
			Planetas.add(planeta);
			System.out.println("Se ha creado tu planeta" + nombre);
			System.out.println("AÃ±adir otro planeta? 0 no 1 Si");
			respuesta = sc.nextInt();
			sc.nextLine();

		}

	}

	public static void imprimirPlaneta(ArrayList<Object[]> Planetas) {
		File listado = new File("listado");
		try {
			listado.createNewFile();
			FileWriter fw = new FileWriter("listado");
			for (Object[] i : Planetas) {
				fw.write((String) i[0] + " , " + Integer.toString((int) i[1]) + " , " + (String) i[2] + "\n");

			}
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}

	}
}