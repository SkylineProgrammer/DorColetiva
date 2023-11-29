package somente_a_dor_coletiva_gera_uniao;


public class Dx03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Iteração do loop externo " + i + ": ");

			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");

				if (j == 3) {
					break;
				}
			}
			System.out.println();
		}
	}

}
