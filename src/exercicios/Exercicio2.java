package exercicios;

import interfaces.Exercicio;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Peça ao usuário para inserir dois números inteiros.
 * Compare os números e imprima uma mensagem indicando se são iguais,
 * diferentes, o primeiro é maior ou o segundo é maior.
 */
public class Exercicio2 implements Exercicio {
    private int[] numeros;

    private int[] pedirNumeros(){
        String[] entradaCrua = Exercicio.scanner.nextLine().strip().split(" ");
        Supplier<IntStream> intStreamSupplier = () -> Arrays
                .stream(entradaCrua)
                .filter((str) -> !str.isEmpty())
                .mapToInt(Integer::parseInt);
        return this.numeros = intStreamSupplier.get().count() == 2
            ? intStreamSupplier.get().toArray()
            : pedirNumeros();
    }
    private String numeroMaior(){
        return numeros[0] > numeros[1]
            ? "o primeiro é maior que o segundo"
            : "o segundo é maior que o primeiro";
    }
    @Override
    public void executar() {
        System.out.println("digite dois números inteiros separados por um espaço.");
        pedirNumeros();
        System.out.println(
            numeros[1] == numeros[0]
                ? "os números são iguais"
                : "os números são diferentes e " + numeroMaior()
        );

    }
}
