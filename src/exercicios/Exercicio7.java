package exercicios;

import interfaces.Exercicio;

/**
 * Faixa Etária: Receba a idade de uma pessoa e imprima se ela é:
 *  menor de idade, adulta ou idosa
 *  (use, por exemplo, 18 para adulta e 60 para idosa).
 */
public class Exercicio7 implements Exercicio {

    private String getMensagem(int idade){
        String mensagem = "é menor de idade";
        if (idade > 18 && idade < 60)
            mensagem = "é adulto";
        else if (idade > 59)
            mensagem = "é idosa";
        return mensagem;
    }
    @Override
    public void executar() {
        System.out.println("me diga a idade de uma pessoa: ");
        System.out.println(
            getMensagem(Exercicio.scanner.nextInt())
        );
    }
}
