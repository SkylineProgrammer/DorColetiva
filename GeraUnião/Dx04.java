package somente_a_dor_coletiva_gera_uniao;


	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("loop externo " + i + ": ");

			for (int j = 1; j <= 5; j++) {

				if (j == 3) {
					continue;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
