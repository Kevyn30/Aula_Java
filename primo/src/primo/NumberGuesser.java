package primo;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		drawNumber();
	}

	private static void drawNumber() {
		int num,attempt;

		Random dig = new Random();

		int randomNumber = dig.nextInt(1000);

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.print("Digite para tentar acertar o número.");

		num = inputScanner.nextInt();

		attempt=1;
		String approximation = "";
		while(num != randomNumber) {
			System.out.println("-----------------------------------------------------");
			if(num<randomNumber) {
				approximation = "maior";
			}
			if(num>randomNumber) {
				approximation = "menor";
			}
			System.out.println("tente mais uma vez. O número é "+ approximation + " que "+ num+". ");
			num = inputScanner.nextInt();

			attempt++;
		}
		System.out.println("Você ganhou!!! Parabens( ◡̀_◡́)ᕤ");
		System.out.println("");
		System.out.println("Tentativas realizadas: "+ attempt);

		
	}

}
