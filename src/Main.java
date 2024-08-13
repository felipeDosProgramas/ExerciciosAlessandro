import Exceptions.CancelarException;
import exercicios.*;
import interfaces.*;

public class Main {
    /**
     * Fiz um array de <i>Lambdas</i> pois, assim, as classes são instanciadas
     * em tempo de execução, e não de compilação. Portanto, são instanciadas
     * apenas as classes que forem usadas
     */
    private static final ExercicioFunc[] exercicios = {
        () -> new Exercicio1(),
        () -> new Exercicio2(),
        () -> new Exercicio3(),
        () -> new Exercicio4(),
        () -> new Exercicio5(),
        () -> new Exercicio6(),
        () -> new Exercicio7(),
        () -> new Exercicio8(),
        () -> new Exercicio9(),
        () -> new Exercicio10()
    };

    private static final Exercicio[] exerciciosInstanciados = new Exercicio[exercicios.length];

    private static Exercicio getInstanciaDoExercicio(int numeroExercicio){
        if (exerciciosInstanciados[numeroExercicio] == null) {
            exerciciosInstanciados[numeroExercicio] = exercicios[numeroExercicio].run();
            System.out.println("instânciando classe de número " + (numeroExercicio + 1) + "...");
        }
        return exerciciosInstanciados[numeroExercicio];
    }

    private static Exercicio getExercicio() throws CancelarException
    {
        System.out.println("escolha um exercício de 1 até " + exercicios.length +" \n 0 se quiser sair.");
        int escolha = Exercicio.scanner.nextInt();
        if (escolha == 0)
            throw new CancelarException("cancelar");
        return escolha > exercicios.length || escolha < 0
            ? getExercicio()
            : getInstanciaDoExercicio(escolha - 1);
    }

    public static void main(String[] args) {
        boolean continuar = true;
        do try
        {
            getExercicio()
                .executar();
        }
        catch (CancelarException _) {
            continuar = false;
        }
        while(continuar);
    }
}