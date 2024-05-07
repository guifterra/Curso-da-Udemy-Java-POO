package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d1 = LocalDate.parse("01/01/1980" , fmt1);
		String d1Txt = d1.format(fmt1);
		String d2Txt = fmt1.format(d1);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		Instant d2 = Instant.parse("2022-12-02T00:00:00Z");
		
		System.out.println("\n D1: " + d1Txt);
		System.out.println("\n D2: " + d2Txt);
		System.out.println("\n D3: " + fmt2.format(d2));
		
	}

}
