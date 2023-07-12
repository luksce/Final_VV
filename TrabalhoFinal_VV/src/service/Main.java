package service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocadoraCarros locadora = new LocadoraCarros();

        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Realizar Empréstimo");
            System.out.println("3. Cadastrar Usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 0:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                case 1:
                    System.out.println("\n--- Adicionar Carro ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ano de Fabricação: ");
                    int anoFabricação = Integer.parseInt(scanner.nextLine());
                    System.out.print("Número total de modelos do carro: ");
                    int numExemplaresCarroTotal = Integer.parseInt(scanner.nextLine());

                    Carro carro = new Carro(nome, marca, anoFabricação, numExemplaresCarroTotal);
                    locadora.adicionarCarro(carro);
                    break;
                case 2:
                    System.out.println("\n--- Realizar Aluguel ---");
                    System.out.print("Identificação do usuário: ");
                    int identificacaoUsuario = Integer.parseInt(scanner.nextLine());
                    Pessoa usuario = null;
                    for (Pessoa u : locadora.getPessoas()) {
                        if (u.getIdentificacao() == identificacaoUsuario) {
                            usuario = u;
                            break;
                        }
                    }

                    if (usuario != null) {
                        System.out.print("Nome do carro a ser alugado: ");
                        String nomeCarro = scanner.nextLine();
                        Carro carroAlugado = locadora.pesquisarCarro(nomeCarro);

                        if (carroAlugado != null) {
                            usuario.emprestarCarro(carroAlugado);
                        } else {
                            System.out.println("service.Carro não encontrado!");
                        }
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Cadastrar Usuário ---");
                    System.out.print("Nome: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Identificação: ");
                    int identificacao = Integer.parseInt(scanner.nextLine());

                    Pessoa novoUsuario = new Pessoa(nomeUsuario, identificacao);
                    locadora.registrarPessoa(novoUsuario);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
