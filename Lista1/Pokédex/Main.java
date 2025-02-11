package executavel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int K = scanner.nextInt();
		int J = scanner.nextInt();
		int H = scanner.nextInt();

		int Kanto = scanner.nextInt();
		int Johto = scanner.nextInt();
		int Hoenn = scanner.nextInt();

		K += Kanto;
		J += Johto;
		H += Hoenn;

		System.out.println(K + " " + J + " " + H);

		scanner.close();
	}
}
