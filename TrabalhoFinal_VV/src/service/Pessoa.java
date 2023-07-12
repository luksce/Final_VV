package service;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int identificacao;
    private List<Carro> carrosEmprestados;

    public Pessoa(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.carrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public List<Carro> getCarrosEmprestados() {
        return carrosEmprestados;
    }

    public void emprestarCarro(Carro carro) {
        if (carrosEmprestados.contains(carro)) {
            System.out.println("Você já alugou um carro deste modelo: " + carro.getNome());
        } else {
            carro.emprestar();
            carrosEmprestados.add(carro);
        }
    }

    public void devolverCarro(Carro carro) {
        if (carrosEmprestados.contains(carro)) {
            carro.devolver();
            carrosEmprestados.remove(carro);
        } else {
            System.out.println("Você não alugou esse carro: " + carro.getNome());
        }
    }
}
