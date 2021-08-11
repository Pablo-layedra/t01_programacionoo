package Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class MainTGVectores {
	
	void merge(int arr[], int beg, int mid, int end) {

		int l = mid - beg + 1;
		int r = end - mid;

		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];

		for (int i = 0; i < l; i++)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < r; j++)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	public static void main(String args[]) {
		System.out.print("Ingrese la dimension del vector: ");
		Scanner teclado = new Scanner(System.in);
		int Z = teclado.nextInt();
		int datos[] = new int[Z];
		System.out.println(" ");
		MainTGVectores ob = new MainTGVectores();
		for(int i = 0 ; i < Z ; i++) {
			System.out.print("Ingrese un valor para la posicion " + i + ": ");
			int N = teclado.nextInt();
			datos[i] = N;
		}

		ob.sort(datos, 0, datos.length - 1);
		System.out.println(" ");
		System.out.println("EL ORDEN ES: ");
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i] + "");
		}
		
		System.out.println("Ordenamiento de Java:");
		System.out.println("Vector antes de ordenar: "+ Arrays.toString(datos));
		
		Arrays.sort(datos);
		
		System.out.println("Vector despues de ordenar: "+ Arrays.toString(datos));
	}
}

