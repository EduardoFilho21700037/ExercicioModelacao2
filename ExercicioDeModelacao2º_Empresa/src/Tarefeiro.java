import java.util.ArrayList;
import java.util.List;

public class Tarefeiro extends FuncionarioComTarefa{


    Tarefeiro(String nome, int salarioBase){
        super(nome, salarioBase);
        tarefas = new ArrayList<>();

    }

    @Override
    double calculaSalario(String mes) {

        int nrDeHorasTrabalhadas =0;
        int nrTarefas=0;

        for (Tarefa tarefa:tarefas){
            String mesTarefa = tarefa.getMes();
            if (mesTarefa.equals(mes)){
                nrDeHorasTrabalhadas ++;
            }
        }
        double bonus = 0;

        if(nrTarefas > 100 && nrDeHorasTrabalhadas < 75){
            bonus = 0.25 * (nrTarefas - 50);
        }

        return 505 + 2 * nrDeHorasTrabalhadas + bonus;
    }


}
