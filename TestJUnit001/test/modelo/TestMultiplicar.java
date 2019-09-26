package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMultiplicar {

    public TestMultiplicar() {
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 16;
        int result = instance.Multiplicar();
        assertTrue(instance.Multiplicar() == 16);
    }

}
