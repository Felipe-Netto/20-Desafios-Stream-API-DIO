import java.util.Arrays;
import java.util.List;

public class Desafio_2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
          Desafio 2 - Imprima a soma dos números pares da lista:
          Utilizando a Stream API, realize a soma dos números pares
          da lista e exiba o resultado no console.
        */

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        int resultado = numerosPares.stream()
                .reduce(0,Integer::sum);

        System.out.println("O resultado da soma dos números pares é: " + resultado);
    }
}
