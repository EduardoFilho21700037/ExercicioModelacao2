public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        boolean sucesso;

        conta.depositar(200);



        sucesso = conta.levantar(100);

        sucesso = conta.levantar(150);

        if (!sucesso){
            System.out.println("Saldo insuficente!!!");
        }

        System.out.println("Saldo = "+conta.getSaldo()+" euros");
    }

}


