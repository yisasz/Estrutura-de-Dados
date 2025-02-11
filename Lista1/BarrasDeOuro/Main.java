package executavel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaTotal = 0;
        int num;

        while (true) {
            System.out.print("Informe um número: ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 500) {
                System.out.println("Número inválido! O número deve ser menor ou igual a 500.");
                continue;
            }

            somaTotal += num;
        }

        System.out.println("Total de barras de ouro: " + somaTotal);
        sc.close();
    }
}
