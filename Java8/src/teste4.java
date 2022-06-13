import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class teste4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate agora = LocalDate.now();
		
		System.out.println(agora);
		
		LocalDate data = LocalDate.of(2099,Month.JANUARY, 25);
		
		System.out.println(data);
		
		System.out.println(data.getYear() - agora.getYear());
		
		System.out.println(Period.between(agora,data));
		
		DateTimeFormatter formatoAgora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String agoraFormatada = formatoAgora.format(agora);
		
		System.out.println(agoraFormatada);
	}
	

}
