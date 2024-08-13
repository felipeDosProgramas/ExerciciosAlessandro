package exercicios;

import interfaces.Exercicio;

/**
 * Crie um programa que solicite ao usuário a entrada de um número inteiro.
 * Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */
public class Exercicio5 implements Exercicio {
    @Override
    public void executar() {
       System.out.println("escreva um número inteiro");
       System.out.println(
           Exercicio.scanner.nextInt() % 2 == 0
               ? "seu número é par"
               : "seu número é impar"
       );
    }
}
