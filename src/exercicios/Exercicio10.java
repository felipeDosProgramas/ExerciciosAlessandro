package exercicios;

import interfaces.Exercicio;

/**
 * Senha Secreta:
 * Defina uma senha secreta (por exemplo: "Java123").
 * Use um loop while para pedir ao usuário que insira a senha.
 * Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário
 * que a tentativa foi inválida. Se ele acertar, saia do loop e imprima uma mensagem de sucesso.
 */
public class Exercicio10 implements Exercicio {
    final private String SENHA_SECRETA = "java-i-tarde";

    @Override
    public void executar() {
        String senha;
        Exercicio.scanner.nextLine();
        do {
            System.out.println("tente acertar a senha");
            senha = Exercicio.scanner.nextLine();
        }
        while (!SENHA_SECRETA.equals(senha));
        System.out.println("meus parabéns, vc acertou a senha!");
    }
}
