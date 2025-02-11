package executavel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os parâmetros (HF, HDF, HA) separados por espaço ou 'FIM FIM FIM' para encerrar:");

		boolean teveVitoria = false;
		while (true) {
			String entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("FIM FIM FIM")) {
				break;
			}

			String[] valores = entrada.split(" ");

			if (valores.length == 3) {
				String HF = valores[0];
				String HDF = valores[1];
				String HA = valores[2];

				if (HF.equalsIgnoreCase("NAO") && HDF.equalsIgnoreCase("SIM") && HA.equalsIgnoreCase("NAO")) {
					teveVitoria = true;
				}
			} else {
				System.out.println("Parâmetros inválidos. Por favor, insira exatamente três parâmetros.");
			}
		}

		if (teveVitoria) {
			System.out.println("VITÓRIA.");
		} else {
			System.out.println("DERROTA.");
		}

		sc.close();
	}
}
