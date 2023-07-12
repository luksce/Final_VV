package service;

public class Carro {
    private String nome;
    private String marca;
    private int anoFabricação;
    private int numCarrosDisponiveis;
    private int numCarrosTotal;

    public Carro(String nome, String marca, int anoFabricação, int numCarrosTotal) {
        this.nome = nome;
        this.marca = marca;
        this.anoFabricação = anoFabricação;
        this.numCarrosTotal = numCarrosTotal;
        this.numCarrosDisponiveis = numCarrosTotal;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricação;
    }

    public int getNumCarrosDisponiveis() {
        return numCarrosDisponiveis;
    }

    public void emprestar() {
        if (numCarrosDisponiveis > 0) {
            numCarrosDisponiveis--;
            System.out.println("service.Carro alugado: " + nome);
        } else {
            System.out.println("Não há carros desse modelo disponíveis para aluguel: " + nome);
        }
    }

    public void devolver() {
        if (numCarrosDisponiveis < numCarrosTotal) {
            numCarrosDisponiveis++;
            System.out.println("service.Carro devolvido: " + nome);
        } else {
            System.out.println("Todos os modelos desse carro estão disponiveis para aluguel: " + nome);
        }
    }
}