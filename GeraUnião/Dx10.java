package somente_a_dor_coletiva_gera_uniao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class Dx10 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            numeros.add(random.nextInt(201) - 100);
        }

        Collections.shuffle(numeros, new Random());

        System.out.println("Array Randomizada: " + numeros);

        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println("Número negativo encontrado. Loop encerrado.");
                break;
            }

            System.out.println("Número: " + numero);
        }
    }
}
