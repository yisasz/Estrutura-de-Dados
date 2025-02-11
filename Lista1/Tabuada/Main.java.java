package executavel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int K = scanner.nextInt();
		int J = scanner.nextInt();
		int H = scanner.nextInt();

		int Knew = scanner.nextInt();
		int Jnew = scanner.nextInt();
		int Hnew = scanner.nextInt();

		K += Knew;
		J += Jnew;
		H += Hnew;

		System.out.println(K + " " + J + " " + H);

		scanner.close();
	}
}
