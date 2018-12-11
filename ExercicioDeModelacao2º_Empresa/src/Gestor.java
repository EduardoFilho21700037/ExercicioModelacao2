public class Gestor extends FuncionarioComTarefa {

    Gestor(String nome, int salarioBase){
        super(nome,salarioBase);

    }

    @Override
    double calculaSalario(String mes) {
        return 0;
    }

   /* double calcularSalario(String mes){
        int tarefasGeridas = 0;
    } */
}
