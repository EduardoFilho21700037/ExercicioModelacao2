public class ClienteEmpresarial extends Cliente {
    String nomePessoaResponsavel;
    int telefonePessoaResponsavel;

    ClienteEmpresarial(String nome, int contactoTelefonico, int nif) {
        super(nome, contactoTelefonico, nif);
    }


    void mostrar(){
        System.out.println("Nome da pessoa responsável = " + nomePessoaResponsavel);
        System.out.println("Telefone da Pessoa responsável = " + telefonePessoaResponsavel);

    }

    void getClienteEmpresarial(){}

}
