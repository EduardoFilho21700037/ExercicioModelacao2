public class Main {

    public static void main(String[] args) {
	Empresa empresa = new Empresa();

	Funcionario funcionario1= new Funcionario("Zé Francisco");
	empresa.contratarFuncionario(funcionario1);

	Funcionario funcionario2 = new Funcionario("Joaquim Barbosa");
	empresa.contratarFuncionario(funcionario2);

	Funcionario funcionario3 = new Funcionario("Anibal Silva");
	empresa.contratarFuncionario(funcionario3);

	Funcionario funcionario4 = new Funcionario("Alberto Soares");
	empresa.contratarFuncionario(funcionario4);

	Tarefa tarefa1 = new Tarefa("Resolver bug #123");
	Tarefa tarefa2 = new Tarefa("Reslover bug #456");
	Tarefa tarefa3 = new Tarefa("Novas funcionalidades");
	Tarefa tarefa4 = new Tarefa("Comprar equipamentos");

	empresa.atribuirTarefa(tarefa1, funcionario1);
	empresa.atribuirTarefa(tarefa2,funcionario2);
	empresa.atribuirTarefa(tarefa3, funcionario3);
	empresa.atribuirTarefa(tarefa4, funcionario4);

	tarefa1.setMes("Janeiro");
	tarefa1.setDuracao(10);

	tarefa2.setMes("Janeiro");
	tarefa2.setDuracao(5);

	tarefa3.setMes("Fevereiro");
	tarefa3.setDuracao(25);

	empresa.relatorioSalarios("Janeiro");
	empresa.relatorioSalarios("Fevereiro");

    }
}
