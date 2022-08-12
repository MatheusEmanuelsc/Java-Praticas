package ArquivosDEGravacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {
	public static void main(String[] args) {

		LocalDate do1 = LocalDate.now();// inatacia a data atual Local
		LocalDateTime do2 = LocalDateTime.now();// instancia com da data e hora Local

		Instant d03 = Instant.now();// GLobal horario gmt londres agora

		System.out.println(do1);
		System.out.println(do2);
		System.out.println(d03);

		LocalDate d04 = LocalDate.parse("2022-07-20");// convertendo um texto para data local
		LocalDateTime do5 = LocalDateTime.parse("2022-07-20T01:30:26");// convetendo texto em datahora formato iso
		Instant d06 = Instant.parse("2022-07-20T01:30:20Z");//texto padrao gmt lodres
		Instant d07 = Instant.parse("2022-07-20T01:30:20-03:00");//texto em gmt convertendo para horario local escolhi sao paulo
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");// caso deseje mudar  a  formatacao data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//Caso deseje mudar  formtacao data e hora
		
		LocalDate d08 = LocalDate.parse("20/07/2024",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2024 02:25",fmt2);
		
		
		LocalDate d010= LocalDate.of(2022, 04, 27);//caso deseje inacia mes e  data um de cada vez
		LocalDateTime d011= LocalDateTime.of(2022, 05, 20, 01, 30);//mesma coisa mais com horario
		
		System.out.println(d04);
		System.out.println(do5);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d010);
		System.out.println(d011);
		
		System.out.println(d04.format(fmt1));//caso queria formata modo 1
		System.out.println(fmt1.format(d04));//segundo jeito;
	}

}
