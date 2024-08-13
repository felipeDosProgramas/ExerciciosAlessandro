package exercicios;

import interfaces.Exercicio;

/**
 * Lista de Nomes:
 * Peça ao usuário para inserir 5 nomes (um de cada vez).
 * Após inserir todos os nomes, peça outro nome e use um loop for para percorrer
 * a lista e verificar se o 6º(último) nome digitado está presente no array dos
 * 5 nomes informados inicialmente.
 */
public class Exercicio9 implements Exercicio {

    private String[] getNomes(){
        String[] nomes = new String[5];
        int i = 0;
        while (i != 5)
            nomes[i++] = Exercicio.scanner.nextLine().trim();
        return nomes;
    }
    private boolean nomeEstaPresente(String nome, String[] nomes){
        for (String n: nomes)
            if (nome.equals(n))
                return true;
        return false;
    }
    @Override
    public void executar() {
        Exercicio.scanner.nextLine();
        System.out.println("digite 5 nomes, um de cada vez e pressionando Enter entre eles.");
        var nomes = getNomes();
        System.out.println("digite agora um outro nome, verei se ele está no meio dos outros");
        System.out.println(
            nomeEstaPresente(Exercicio.scanner.nextLine(), nomes)
                ? "o nome está presente na lista"
                : "não esta presente"
        );

    }
}
