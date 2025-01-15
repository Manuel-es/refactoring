package refactoring;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int[] numeros = new int[5];

        System.out.println("Ingresa 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt() * 2;
        }

        Arrays.sort(numeros);

        System.out.println("\nLos números multiplicados por 2 y ordenados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
	}
}
