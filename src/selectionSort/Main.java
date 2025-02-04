package selectionSort;

public class Main {

	public static void main(String[] args) {

		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * vector.length);
		}
		System.out.println("Desordenado");

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);

		}

		int menorPosition, aux;
		for (int i = 0; i < vector.length; i++) {
			menorPosition = i;
			for (int j = i + 1; j < vector.length; j++) { //0(n^2)
				if (vector[j] < vector[menorPosition]) {
					menorPosition = j;
				}
			}
			aux = vector[menorPosition];
			vector[menorPosition] = vector[i];
			vector[i] = aux;
		}

		System.out.println("\n\nOrdenado");
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}

}
