public class Cliente {

    String nome;
    int contactoTelefonico;
    int nif;


    Cliente(String nome, int contactoTelefonico, int nif){
        this.nome=nome;
        this.contactoTelefonico=contactoTelefonico;
        this.nif=nif;

    }

   void mostrar(){
       System.out.println("nome" + nome);
       System.out.println("contactoTelefonico" + contactoTelefonico);
       System.out.println("NIF" + nif);

   }


}
