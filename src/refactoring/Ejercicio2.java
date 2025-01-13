package refactoring;

public class Ejercicio2 {

	 public static void main(String[] args) {
	        char[] tabla = new char[20];
	        int[] frecuencias = new int[5]; // Para las vocales: a, e, i, o, u

		final char v1 = 'a', v2 = 'e', v3 = 'i', v4 = 'o', v5 = 'u';
		char[] vocales = { v1, v2, v3, v4, v5 };


	        // Contar frecuencias usando switch
	        for (char c : tabla) {
	            switch (c) {
	                case 'a' -> frecuencias[0]++;
	                case 'e' -> frecuencias[1]++;
	                case 'i' -> frecuencias[2]++;
	                case 'o' -> frecuencias[3]++;
	                case 'u' -> frecuencias[4]++;
	            }
	        }

		int[] frecuencia = new int[5];

		for (int i = 0; i < 20; i++) {
			int randomNum = (int) (Math.random() * 5);
			tabla[i] = vocales[randomNum];
		}

		for (int i = 0; i < 20; i++) {
			switch (tabla[i]) {
		    case v1:
		        frecuencia[0]++;
		        break;
		    case v2:
		        frecuencia[1]++;
		        break;
		    case v3:
		        frecuencia[2]++;
		        break;
		    case v4:
		        frecuencia[3]++;
		        break;
		    case v5:
		        frecuencia[4]++;
			}
		}

		System.out.println("Tabla de vocales aleatorias:");
		for (int i = 0; i < 20; i++) {
			System.out.print(tabla[i] + " ");
		}

		System.out.println("\n\nFrecuencia de cada vocal:");
		System.out.println("Vocal '" + v1 + "': " + frecuencia[0]);
		System.out.println("Vocal '" + v2 + "': " + frecuencia[1]);
		System.out.println("Vocal '" + v3 + "': " + frecuencia[2]);
		System.out.println("Vocal '" + v4 + "': " + frecuencia[3]);
		System.out.println("Vocal '" + v5 + "': " + frecuencia[4]);
	}

}
