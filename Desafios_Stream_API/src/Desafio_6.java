import java.util.Arrays;
import java.util.List;

public class Desafio_6 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 50, 4, 3);

        /*
         Desafio 6 - Verificar se a lista contém algum número maior que 10:
         Utilize a Stream API para verificar se a lista contém algum número
         maior que 10 e exiba o resultado no console.
        */

        boolean maiorQueDez = numeros.stream()
                .anyMatch(n -> n > 10);

        if(maiorQueDez)
            System.out.println("Existem números maiores que dez na lista");
        else{
            System.out.println("Não existem números maiores que dez na lista");
        }

        // ou

        List<Integer> maioresQueDez = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        if(!maioresQueDez.isEmpty()){
            System.out.println("Existem números maiores que dez na lista:");
            maioresQueDez.forEach(System.out::println);
        }else{
            System.out.println("Não existem números maiores que dez na lista");
        }

    }
}
