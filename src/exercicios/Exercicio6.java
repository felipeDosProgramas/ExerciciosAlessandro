package exercicios;

import interfaces.Exercicio;

/**
 * Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
 */
public class Exercicio6 implements Exercicio {
    private int calcularFatorial(int n) {
        return n <= 1
            ? 1
            : n * calcularFatorial(n - 1);
    }
    @Override
    public void executar() {
        System.out.println("digite um número natural");
        System.out.println(
            calcularFatorial(Exercicio.scanner.nextInt())
        );
    }
}
