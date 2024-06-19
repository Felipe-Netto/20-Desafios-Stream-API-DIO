import java.util.Arrays;
import java.util.List;

public class Desafio_20 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
         vamos criar um programa que encontre o número menor da lista utilizando
         a Stream API.
        */

        int menorNumero = numeros.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println("O menor elemento da lista é: " + menorNumero);

    }

}
