package Fecha;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Jose Ramon
 * @version 1.0
 *
 */
public class Fecha {
	private int dia;
	private int mes;
	private int anio;
/**
 * Contructor Fecha
 * @param dia 
 * @param mes
 * @param anio
 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
/**
 * Metodo que dice si una Fecha es válida
 * @return true si es válida, false si no es válida 
 */
	public boolean valida() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
		if (anio < 0)
			return false;
		// determinamos la cantidad de días del mes:
		int diasMes = diasMes();
		if (dia > diasMes)
			return false;
		else
			return true;
	}

	private int diasMes() {
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2: // verificación de año bisiesto
			if (esBisiesto())
				diasMes = 29;
			else
				diasMes = 28;
			break;
		}
		return diasMes;
	}

	private boolean esBisiesto() {
		return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
	}


}