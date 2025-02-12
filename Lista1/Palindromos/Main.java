import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();

		if (palavra.length() >= 1 && palavra.length() <= 100) {
			char[] vetor = palavra.toCharArray();

			for (int i = 0, j = vetor.length - 1; i < j; i++, j--) {
				if (vetor[i] != vetor[j]) {
					System.out.println("Não");
					return;
				}
			}
			System.out.println("Sim");
		}

	}

}
