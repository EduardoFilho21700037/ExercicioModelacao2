public abstract class Funcionario {

    String nome;
    int salarioBase;

    Funcionario(String nome, int salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;

    }
    abstract double calculaSalario(String mes);



}
