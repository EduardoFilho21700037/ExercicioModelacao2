import java.util.ArrayList;
import java.util.List;

public abstract class FuncionarioComTarefa extends Funcionario {
    List<Tarefa> tarefas;

    FuncionarioComTarefa(String nome, int salarioBase){
        super(nome,salarioBase);
        tarefas = new ArrayList<>();

    }

    void atribuirTarefa(){

    }

}
