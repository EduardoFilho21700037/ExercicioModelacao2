import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarios = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Tarefa> tarefas = new ArrayList<>();

void adicionarCliente(Cliente novoCliente){
    clientes.add(novoCliente);

}

void contratarFuncionario(Funcionario novoFuncionario){
    funcionarios.add(novoFuncionario);

}

void relatorio1(){

}

    void  relatorioSalarios(String mes) {
        System.out.println("-------------------------------------------");
        System.out.println("Relatório de salários do mês de" + mes);
        System.out.println("--------------------------------------------");

    }

}
