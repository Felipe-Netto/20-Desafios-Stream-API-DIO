import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio_18 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        /*
         Desafio 18 - Verifique se todos os números da lista são iguais:
         Utilizando a Stream API, verifique se todos os números da lista
         são iguais e exiba o resultado no console.
        */

        List<Integer> numerosIguais = numeros.stream()
                .distinct()
                .toList();

        if(numerosIguais.size() == numeros.size()){
            System.out.println("Todos os elementos da lista são iguais");
        }else{
            System.out.println("Não são todos os elementos da lista que são iguais");
        }
    }

}
