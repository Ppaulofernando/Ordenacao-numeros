package ordenacao;

import java.util.Scanner;

public class Ordenacao {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] numeros = new int[6];
		int contador = 1;
		int auxiliar;
		while (contador < 7) {
			//72; 56; 4; 108; 12; 57
			System.out.print("Digite o " + contador + "º número: ");
			numeros[contador - 1] = in.nextInt();
			contador = contador + 1;

		}
		in.close();
		for (int i = 0; i < 5; i++) {
				for (int j = i + 1; j < 6; j++) {
				if (numeros[i] > numeros[j]) {
					auxiliar = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = auxiliar;
				}
			}
		}
		System.out.print("Números ordenados:\n");
		for (int i = 0; i < 6; i++) {
			if (numeros[i] > numeros[0] ) {
				System.out.print(" ; ");
			}
			System.out.print(numeros[i]);
		}
	}
}
