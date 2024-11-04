package primo;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		drawNumber();
	}

	private static void drawNumber() {
		int num,tentativa;

		Random dig = new Random();

		int randomNumber = dig.nextInt(1000);

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.print("Digite para tentar acertar o número.");

		num = inputScanner.nextInt();
		tentativa=1;
		
		while(num != randomNumber) {
			if(num<randomNumber) {
				System.out.println("-----------------------------------------------------");
				System.out.println("tente mais uma vez. O número é maior que "+ num+". ");
				num = inputScanner.nextInt();
				tentativa++;
			}
			if(num>randomNumber) {
				System.out.println("-----------------------------------------------------");
				System.out.println("tente mais uma vez. O número é menor que "+ num+". ");
				num = inputScanner.nextInt();
				tentativa++;
			}
		
		}
		System.out.println("Você ganhou!!! Parabens( ◡̀_◡́)ᕤ");
		System.out.println("");
		System.out.println("Tentativas realizadas: "+tentativa);
		
	}

}
