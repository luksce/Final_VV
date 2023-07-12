package test;

import service.*;
import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

    @Test
    public void testEmprestimoEDevolucao() {
        Carro carro = new Carro("Celta", "Chevrolet", 1999, 5);
        Pessoa usuario = new Pessoa("João", 1);
        LocadoraCarros locadora = new LocadoraCarros();
        locadora.adicionarCarro(carro);
        locadora.registrarPessoa(usuario);

        usuario.emprestarCarro(carro);
        Assert.assertEquals(1, usuario.getCarrosEmprestados().size());

        usuario.devolverCarro(carro);
        Assert.assertEquals(0, usuario.getCarrosEmprestados().size());
    }
}

