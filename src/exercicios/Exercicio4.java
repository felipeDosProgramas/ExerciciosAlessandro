package exercicios;

import interfaces.Exercicio;

/**
 * Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */
public class Exercicio4 implements Exercicio {
    @Override
    public void executar() {
        System.out.println("escreva um número inteiro");
        int num = Exercicio.scanner.nextInt();
        for (int i = 1; i < 11; i++)
            System.out.println(i + " x " + num + " = " + (i * num));
    }
}
