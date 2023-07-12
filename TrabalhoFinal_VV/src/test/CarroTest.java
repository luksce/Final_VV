package test;
import service.*;
import org.junit.Assert;
import org.junit.Test;

public class CarroTest {

    @Test
    public void testEmprestar() {
        Carro carro = new Carro("Celta", "Chevrolet", 1999, 5);
        carro.emprestar();
        Assert.assertEquals(4, carro.getNumCarrosDisponiveis());
    }

    @Test
    public void testDevolver() {
        Carro carro = new Carro("Celta", "Chevrolet", 1999, 5);
        carro.emprestar();
        carro.devolver();
        Assert.assertEquals(5, carro.getNumCarrosDisponiveis());
    }
}
