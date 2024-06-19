import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Desafio_4 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        /*Desafio 4 - Remova todos os valores ímpares:
        Utilize a Stream API para remover os valores ímpares da lista
        e imprima a lista resultante no console.*/

        List<Integer> numerosImpares = numeros.stream()
                                        .filter(n -> n % 2 != 0)
                                        .toList();

        numeros.removeAll(numerosImpares);

        numeros.forEach(System.out::println);
    }
}
