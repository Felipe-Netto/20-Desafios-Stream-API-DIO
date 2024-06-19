import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Desafio_14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
         Desafio 14 - Encontre o maior número primo da lista:
         Com a Stream API, encontre o maior número primo da lista e
         exiba o resultado no console.
        */

        List<Integer> numerosPrimos = numeros.stream()
                .distinct()
                .filter(n -> n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0))
                .toList();

        Optional<Integer> maiorPrimo = numerosPrimos.stream()
                .max(Comparator.naturalOrder());

        System.out.println("O maior número primo da lista é: " + maiorPrimo.get());
    }

}
