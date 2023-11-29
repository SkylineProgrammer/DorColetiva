package somente_a_dor_coletiva_gera_uniao;

import java.util.Scanner;

 

public class Dx09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }
        }

        sc.close();
	}
}
