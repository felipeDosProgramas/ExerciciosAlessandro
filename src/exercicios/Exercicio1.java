package exercicios;

import interfaces.Exercicio;

/**
 * Crie um programa que solicite ao usuário digitar um número.
 * Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */
public class Exercicio1 implements Exercicio {

    @Override
    public void executar() {
        System.out.println("digite um número: ");
        System.out.println(
                Exercicio.scanner.nextInt() > 0
                        ? "seu número é positivo."
                        : "seu número é negativo(ou é o zero)."
        );
    }
}
