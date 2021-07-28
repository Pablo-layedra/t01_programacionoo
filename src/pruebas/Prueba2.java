package pruebas;

import java.util.Scanner;

public class Prueba2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int S = 0;
		int Cni = 1;
		int Snp = 0;
		int Sni = 0;
		float Pni = 0f;
		for (int I = 1; I > (-1); I = I++) {
			System.out.println("Ingresar número positivo:");
			int N = teclado.nextInt();
			if (N == (-1)) {
				I = -2;
			} else {
				if (N % 2 == 0) {
					Snp = Snp + N;
				} else {
					Sni = Sni + N;
					Cni = Cni + 1;
					Pni = Sni / Cni;
				}
			}
		}
		System.out.println("Suman de números pares:" + Snp);
		System.out.println("Promedio de números impares:" + Pni);
	}
}
