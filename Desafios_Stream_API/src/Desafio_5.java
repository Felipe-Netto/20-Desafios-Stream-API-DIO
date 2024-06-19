import java.util.Arrays;
import java.util.List;

public class Desafio_5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*Desafio 5 - Calcule a média dos números maiores que 5:
         Com a Stream API, calcule a média dos números maiores que
         5 e exiba o resultado no console.*/

        List<Integer> maioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();

        int total = maioresQueCinco.stream()
                .reduce(0, Integer::sum);

        double media = (double) total / maioresQueCinco.size();

        System.out.println("A média é: " + media);

    }
}
