import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double tempoAntigo = System.currentTimeMillis();
		
		String s = scanner.nextLine();
		
		if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
			if(s.length() >= 10) {
				System.out.println("Legal!!, A mensagem é"+s);
			}else {
				System.out.println("Sua mensagem é muito curta!");
			}
		}else {
			System.out.println("OPSS!!, Você precisa espera 2 segundos!");
			System.out.println("Vamos tentar novamente?");
			tempoAntigo = System.currentTimeMillis();
			s = scanner.nextLine();
			if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
				System.out.println("Agora Sim!!");
			}else {
				System.out.println("Você falhou 2x! Acabamos o Programa");
			}
			
			
			
		}
	}

	private static int convertTime(double tempo) {
		
		return (int) (tempo/1000);
	}
}
