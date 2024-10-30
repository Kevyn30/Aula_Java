package primo;

import java.util.Scanner;

public class contagem {
	public static void main(String[] arg) {
		int num, rest, prime = 0;

		Scanner dig = new Scanner(System.in);

		System.out.print("Digite o número inicial: ");

		num = dig.nextInt();

		rest = num;

		for (int i = num; i <= rest; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					prime++;
				}
			}
			if (prime == 2) {
				System.out.println("O número " + i + " é primo");
			} else {
				System.out.println("Número " + i + " não é primo");
			}
			prime = 0;
		}
		dig.close();
	}

}
