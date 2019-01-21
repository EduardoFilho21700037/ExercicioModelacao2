import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Tarefa> tarefas;
    List<Funcionario> funcionarios;
    String nome="XPTO";

    Empresa(){
        tarefas = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    Empresa(String nome){
        this.nome=nome;
    }

 void  contratarFuncionario(Funcionario novoFuncionario){
        funcionarios.add(novoFuncionario);
 }

 void atribuirTarefa(Tarefa tarefa, Funcionario funcionario){
        funcionario.atribuirTarefa(tarefa);
 }

 void  relatorioSalarios(String mes){
     System.out.println("-------------------------------------------");
     System.out.println("Relatório de salários do mês de" + mes);
     System.out.println("--------------------------------------------");
     for (Funcionario f : funcionarios){
         System.out.println(f.getNome() + " " + f.calcularSalario(mes));
     }
 }


}
