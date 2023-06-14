import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		
		// Texto Customizado >> Data-hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // DateTimeFormatter: Texto formato customizado >> Data-hora
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Usa-se um objeto para ser o *padrão* de formato do texto customizado.
		
		
		// Agora >> Data-hora
		LocalDate d01 = LocalDate.now(); // Agora >> Data-hora, Objeto d01 do tipo LocalDate / Data
		LocalDateTime d02 = LocalDateTime.now(); // Objeto d02 do tipo LocalDateTime / Data-hora
		Instant d03 = Instant.now(); // Objeto d03 do tipo Instant, horário de Londres / Data-hora-GMT
		
		
		// Texto ISO >> Data-hora
		LocalDate d04 = LocalDate.parse("2022-07-20"); // .parse = permite transformar um texto iso em data-hora
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // .parse = permite transformar um texto iso em data-hora
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // .parse = permite transformar um texto iso em data-hora
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Como informei o fuso de SP, o sistema automaticamente adiciona +3, para exibir o fuso de Londres.
		
		
		// Texto Customizado >> Data-hora
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("22/07/2012", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("22/07/2012 14:02", fmt2);
		
		// Instanciação com valores avulsos
		LocalDate d10 = LocalDate.of(2022, 10, 27);
		LocalDateTime d11 = LocalDateTime.of(2022, 10, 27, 22, 56);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
