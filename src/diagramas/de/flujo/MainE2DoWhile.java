package diagramas.de.flujo;

import java.util.Scanner;

public class MainE2DoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar n�mero:");
		int N = teclado.nextInt();
		int Cni = 0;
		int Snp = N;
		int Sni = N;
		float Pni = 0f;

		do {
			System.out.println("Ingresar nuevo n�mero:");
			N = teclado.nextInt();
			if (N % 2 == 0) {
				Snp = Snp + N;
			} else {
				Sni = Sni + N;
				Cni = Cni + 1;
				Pni = Sni / (Cni-1);
			}
		} while (N >= 0);
		System.out.println("Suman de n�meros pares:" + Snp);
		System.out.println("Promedio de n�meros impares:" + Pni);
	}
}
