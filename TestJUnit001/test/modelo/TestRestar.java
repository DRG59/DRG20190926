package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestRestar {

    public TestRestar() {
    }

    @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 6;
        int result = instance.Restar();
        assertTrue(instance.Restar() == 6);
    }

}
