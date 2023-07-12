package service;

import java.util.ArrayList;
import java.util.List;

public class LocadoraCarros {
    private List<Carro> garagem;
    private List<Pessoa> pessoas;

    public LocadoraCarros() {
        this.garagem = new ArrayList<>();
        this.pessoas = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        garagem.add(carro);
        System.out.println("service.Carro adicionado a locadora de carros: " + carro.getNome());
    }

    public void removerCarro(Carro carro) {
        garagem.remove(carro);
        System.out.println("service.Carro removido da locadora de carros: " + carro.getNome());
    }

    public Carro pesquisarCarro(String nome) {
        for (Carro carro : garagem) {
            if (carro.getNome().equals(nome)) {
                return carro;
            }
        }
        return null;
    }

    public void registrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa registrado: " + pessoa.getNome());
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
        System.out.println("Pessoa removido: " + pessoa.getNome());
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
