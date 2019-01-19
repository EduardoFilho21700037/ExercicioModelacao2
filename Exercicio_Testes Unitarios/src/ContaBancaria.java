public class ContaBancaria {

     long saldo;

    public ContaBancaria(int i){
        this.saldo=saldo;

    }

    public ContaBancaria() { }

    public long getSaldo() {
        return saldo;
    }

    public void depositar(long valor){
        saldo+=valor;
    }
    public boolean levantar(long valor){

        if (valor > saldo){
            return false;
        }else {
            saldo = saldo - valor;
            return true;
        }
    }

}
