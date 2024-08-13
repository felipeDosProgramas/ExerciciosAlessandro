package exercicios;

import interfaces.Exercicio;

import java.util.ArrayList;

/**
 * Soma dos Números Ímpares:
 * Peça ao usuário que insira um número inteiro n.
 * Calcule e imprima a soma dos primeiros <i>n</i> números ímpares.
 * Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.
 */
public class Exercicio8 implements Exercicio {

    private ArrayList<Integer> getNumerosParaSoma(int num){
        ArrayList<Integer> nums = new ArrayList<>();
        int numeroParaSomar = 0;
        for (int i = 0; i < num;numeroParaSomar++)
            if (numeroParaSomar % 2 != 0) {
                nums.add(numeroParaSomar);
                i++;
            }
        return nums;
    }
    private int somarNumeros(ArrayList<Integer> numeros){
        return numeros.stream().reduce(Integer::sum).orElse(0);
    }
    @Override
    public void executar() {
        System.out.println("digite um número inteiro");
        var numerosParaSomar = getNumerosParaSoma(
            Exercicio.scanner.nextInt()
        );
        System.out.println(
            somarNumeros(numerosParaSomar)
        );
    }
}
