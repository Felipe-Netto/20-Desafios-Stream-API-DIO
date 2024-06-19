import java.util.*;

public class Desafio_7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
            Desafio 7 - Encontrar o segundo número maior da lista:
            Com a ajuda da Stream API, encontre o segundo número maior
            da lista e exiba o resultado no console.
        */

        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(numerosDistintos.get(1));

    }

}
