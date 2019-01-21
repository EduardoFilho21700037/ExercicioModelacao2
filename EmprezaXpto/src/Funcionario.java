import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    String nome;
    List<Tarefa> tarefas;

    Funcionario(String nome) {
        tarefas = new ArrayList<>();
        this.nome = nome;

    }

    void atribuirTarefa(Tarefa novaTarefa) {
        tarefas.add(novaTarefa);
    }

    String getNome() {
        return nome;
    }

    double calcularSalario(String mes) {
        int nrHorasTrabalhadas = 0;
        int nrTarefas = 0;

        for (Tarefa tarefa : tarefas) {
            String mesTarefa = tarefa.getMes();
            if (mesTarefa.equals(mes)) {
                nrHorasTrabalhadas = nrHorasTrabalhadas + tarefa.getDuracao();
                nrTarefas++;
            }

        }
        double bonus=0;

        if (nrTarefas > 10 && nrHorasTrabalhadas < 50){
            bonus=0.25 * (nrTarefas - 5);
        }

        return 505 + 2 *nrHorasTrabalhadas + bonus;

    }

}







