import java.util.Scanner;

public class Main {
	public int[] nuemros = {10,20,30};
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int pontos = 0;
		System.out.println("Bem-Vindo!!, Pressione o botão S para continuar");
		String string = scanner.nextLine();
		if(string.equals("s")) {
			System.out.println("Qual a capital do Brasil?");
			string = scanner.nextLine();
			if(string.equals("brasilia")) {
				pontos++;
				System.out.println("Você pontuou!!");
				System.out.println("Você deseja continuar (s) ou desistir? (d)");
				string = scanner.nextLine();
				if(string.equals("s")) {
					System.out.println("Em qual continente fica o Brasil?");
					string = scanner.nextLine();
					if(string.equals("america do sul")) {
						pontos++;
						System.out.println("Você pontuou!!");
						System.out.println("Você pontuou!!");
						System.out.println("Você deseja continuar (s) ou desistir? (d)");
						string = scanner.nextLine();
						if(string.equals("s")) {
							System.out.println("Qual melhor curso de T.I do Brasil?");
							if(string.equals("danki code")) {
								pontos++;
								System.out.println("Você pontuou");
								System.out.println("Sua pontuação final e de:"+pontos);
							}else {
								System.out.println("Game Over!! Sua pontuação foi de:"+pontos);
							}
						}else {
							System.out.println("Game Over!! Sua pontuação foi de:"+pontos);
						}
					}
				}else {
					System.out.println("Game Over!! Sua pontuação foi de:"+pontos);
				}
			}else {
				System.out.println("Game Over!! Sua pontuação foi de:"+pontos);
			}
		}else {
			System.out.println("Acabou o jogo.. Você pontuou 0");
		}
	}
	
}
