package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.print("\n Local date.......: " + d1);
		
		LocalDateTime d2 = LocalDateTime.now();
		System.out.print("\n Local date+time..: " + d2);
		
		Instant d3 = Instant.now();
		System.out.println("\n Instant now......: " + d3);
		
		String dt = "2020-12-03";
		LocalDate d4 = LocalDate.parse(dt);
		System.out.print("\n Local date - String.....: " + d4);
		
		String dt2 = "2020-12-03T11:27:03";
		LocalDateTime d5 = LocalDateTime.parse(dt2);
		System.out.print("\n Local instant - String..: " + d5);
		
		String dt3 = "2020-12-03T00:00:00Z";
		Instant d6 = Instant.parse(dt3);
		System.out.print("\n Local instant - String..: " + d6);
		
		DateTimeFormatter dtFm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dt4 = "04/05/2004";
		LocalDate d7 = LocalDate.parse(dt4, dtFm);
		System.out.print("\n Formatter exa - String..: " + d7);
		
		DateTimeFormatter dtFm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		String dt5 = "04/05/2004 16:07";
		LocalDateTime d8 = LocalDateTime.parse(dt5, dtFm2);
		System.out.print("\n Formatter exa - String..: " + d8);
		
		LocalDate d9 = LocalDate.of(1999, 8, 28);
		System.out.print("\n LocalDate of ...........: " + d9);
	}

}
