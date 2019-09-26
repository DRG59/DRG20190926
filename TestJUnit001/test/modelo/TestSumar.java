package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSumar {

    public TestSumar() {
    }

    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 10;
        int result = instance.Sumar();
        assertTrue(instance.Sumar() == 10);
    }

}
