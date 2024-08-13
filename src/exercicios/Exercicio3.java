package exercicios;

import interfaces.Exercicio;

/**
 * Crie um menu que oferece duas opções ao usuário:
 *  "1. Calcular área do quadrado" e
 *  "2. Calcular área do círculo".
 *  Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */
public class Exercicio3 implements Exercicio {
    private int getOpcao(){
        System.out.println("""
            escolha uma das seguintes ações:
            1. Calcular área do quadrado\s
            2. Calcular área do círculo\s
        """);
        int entrada = Exercicio.scanner.nextInt();
        return entrada == 1 || entrada == 2
            ? entrada
            : getOpcao();
    }
    private double calcularAreaQuadrado(){
        System.out.println("diga o tamanho do lado do quadrado");
        double lado = Exercicio.scanner.nextDouble();
        return lado * lado;
    }
    private double calcularAreaCirculo(){
        System.out.println("diga o tamanho do raio do círculo");
        return Math.pow(Exercicio.scanner.nextDouble(), 2) * Math.PI;
    }
    @Override
    public void executar() {
        System.out.println(
            getOpcao() == 1
                ? calcularAreaQuadrado()
                : calcularAreaCirculo()
        );
    }
}
