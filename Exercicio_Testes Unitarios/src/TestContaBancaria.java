import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestContaBancaria {

    @Test
    public void test01Depositar(){

        ContaBancaria conta = new ContaBancaria(0);

        conta.depositar(200);
        long saldoEsperado = 200;
        long saldoObitido = conta.getSaldo();
        assertEquals(saldoEsperado,saldoObitido);
    }

    @Test
    public void test02Levantar(){

        ContaBancaria conta = new ContaBancaria(200);
        conta.levantar(100);
        int saldoEsperado=100;
        int saldoObitido =100;
        assertEquals(saldoEsperado,saldoObitido);
    }

    @Test
    public void testLevantar(){

        ContaBancaria conta = new ContaBancaria(100);
        conta.levantar(150);
        boolean saldoEsperado=false;
        boolean saldoObitido=false;
        assertEquals(saldoEsperado,saldoObitido);
    }


}
