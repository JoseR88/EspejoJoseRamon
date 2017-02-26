package Fecha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase para probar la clase Fecha
 * 
 * @author Jose Ramon
 * @version 1.0
 * 
 */
public class FechaTest {
	public static void main(String[] args) throws IOException {
		int dia, mes, anyo;
		System.out.println("Introduce un día: ");
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		dia = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un año: ");
		anyo = Integer.parseInt(entrada.readLine());
		Fecha f1 = new Fecha(dia, mes, anyo);
		if (f1.valida())
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo + " esválida");
		else
			System.out.println("La fecha: " + dia + "/" + mes + "/" + anyo + " NO es válida");
	}
}