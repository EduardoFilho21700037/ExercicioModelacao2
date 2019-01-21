public class TecnicoInformatica extends Funcionario {

    TecnicoInformatica(String nome, int salarioBase){
        super(nome,salarioBase);
    }


    @Override
    double calculaSalario(String mes) {
        return salarioBase;
    }
}
