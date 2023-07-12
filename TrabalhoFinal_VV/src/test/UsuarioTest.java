package test;

import service.*;
import org.junit.Test;
import org.junit.Assert;

public class UsuarioTest {

    @Test
    public void testEmprestarCarro() {
        Carro carro = new Carro("Celta", "Chevrolet", 1999, 5);
        Pessoa usuario = new Pessoa("João", 1);
        usuario.emprestarCarro(carro);
        Assert.assertEquals(1, usuario.getCarrosEmprestados().size());
    }

    @Test
    public void testDevolverCarro() {
        Carro carro = new Carro("Celta", "Chevrolet", 1999, 5);
        Pessoa usuario = new Pessoa("João", 1);
        usuario.emprestarCarro(carro);
        usuario.devolverCarro(carro);
        Assert.assertEquals(0, usuario.getCarrosEmprestados().size());
    }
}
