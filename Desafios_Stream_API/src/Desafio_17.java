import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Desafio_17 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
         Desafio 17 - Filtrar os números primos da lista:
         Com a ajuda da Stream API, filtre os números primos da
         lista e exiba o resultado no console.
        */

        List<Integer> numerosPrimos = numeros.stream()
                .distinct()
                .filter(n -> n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0))
                .toList();

        numerosPrimos.forEach(n -> System.out.print(n + " "));


    }

}
