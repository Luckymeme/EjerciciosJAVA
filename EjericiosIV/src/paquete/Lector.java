package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("Archivo.csv");
			BufferedReader br = new BufferedReader(file);
			String linea = br.readLine();
			String pagina = "<html><head><title>Usuarios</title></head><table>"; // <tr>
			String[] charac = linea.split(",");

			/*
			 * Si deseas dividir la cadena en un array de subcadenas utilizando un
			 * delimitador específico (por ejemplo, un espacio), puedes usar el método
			 * split(String regex):
			 */

//			System.out.println(charac);

			/*
			 * // Rellenar la tabla con los datos for (String linea : lineas) {
			 * pagina.append("<tr>"); String[] campos = linea.split(","); for (String campo
			 * : campos) { pagina.append("<td>").append(campo).append("</td>"); }
			 * pagina.append("</tr>"); } // Rellenar la tabla con los datos for (String
			 * linea : lineas) { pagina.append("<tr>"); String[] campos = linea.split(",");
			 * for (String campo : campos) {
			 * pagina.append("<td>").append(campo).append("</td>"); }
			 * pagina.append("</tr>"); }
			 * 
			 * // Cerrar la tabla y el HTML pagina.append("</table></body></html>");
			 * 
			 * // Escribir el contenido HTML en un archivo try (BufferedWriter writer = new
			 * BufferedWriter(new FileWriter("tabla.html"))) {
			 * writer.write(pagina.toString()); } catch (IOException e) {
			 * System.err.println("Error al escribir el archivo HTML: " + e.getMessage()); }
			 * 
			 * System.out.println("Archivo HTML generado con éxito."
			 */

		} catch (IOException e) {
			System.err.println("UPS... " + e);

		}
	}

}
