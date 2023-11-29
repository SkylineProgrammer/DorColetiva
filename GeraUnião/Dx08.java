package somente_a_dor_coletiva_gera_uniao;



public class Dx08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
			
			if (i == 8) {
				break;
			}
		}
	}
}
