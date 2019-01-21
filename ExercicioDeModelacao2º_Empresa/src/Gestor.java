public class Gestor extends FuncionarioComTarefa {

    Gestor(String nome, int salarioBase){
        super(nome,salarioBase);

    }

    @Override
    double calculaSalario(String mes) {
        int nrTarefaGeridas =0;
        for (Tarefa tarefa:tarefas){
            String mesTarefa = tarefa.getMes();
            if (mesTarefa.equals(mes)){
                nrTarefaGeridas++;
            }
        }

        return salarioBase + 0.5 * nrTarefaGeridas;
    }


}
