import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String dados = scanner.next();
		String palavraChave = scanner.next();

		for (int i = 0; i < palavraChave.length(); i++) {
			char letra = palavraChave.charAt(i);
			int index = dados.indexOf(letra);
			if (index != -1) {
				dados = dados.substring(0, index) + dados.substring(index + 1);
			} else {
				System.out.println("Nenhuma informacao util");
				return;
			}
		}

		System.out.println("Palavra chave encontrada");

		scanner.close();
	}
}
