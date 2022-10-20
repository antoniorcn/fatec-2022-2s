package edu.curso;

import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Scanner;

public class TesteLocalDate {
	
	public static void main(String[] args) {
//		LocalDate data = LocalDate.now();
//		Date d = new Date(0);
//		Calendar c = Calendar.getInstance();
//		java.sql.Date sqd = new java.sql.Date(234234243);
		boolean dataValida = false;
		while (!dataValida) {
			System.out.println("Informe o dia de hoje: ");
			Scanner scan = new Scanner(System.in);
			String txtData = scan.nextLine();
			System.out.println("Data digitada: " + txtData);
			
			DateTimeFormatter dtf = 
					DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try { 
				LocalDate dtl = LocalDate.parse(txtData, dtf);
				dataValida = true;
				dtl = dtl.minusDays(1);
				System.out.println("Ontem foi " + dtl);
			} catch (DateTimeParseException e) { 
				dataValida = false;
				System.out.println("Data inválida");
			}
		}

		
	}

}
