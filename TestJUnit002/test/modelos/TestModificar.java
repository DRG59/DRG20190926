package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Libro libro = new Libro("Lib001", "Titulo", "Autor");
        ColeccionLibros instance = new ColeccionLibros();
        instance.Agregar(libro);
        boolean esperado = false;
        libro=new Libro("Lib002", "Titulo2", "Autor2");
        boolean obtenido = instance.Modificar(libro);
        Assert.assertEquals(esperado, obtenido);

    }

}
