import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entregador> entregadores = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Restaurante burgerKing = new Restaurante("Burger King", "Rua da alegria", "43 99999-8888", "Fast Food");
        Restaurante mcDonalds = new Restaurante("McDonalds", "Rua da tristeza", "43 88888-9999", "Fast Food");

        Entregador entregador1 = new Entregador(0, "João", "123.456.789-00", "43 99999-8888", "Moto", "ABC-1234", "123456", "A");
        entregadores.add(entregador1);
        Entregador entregador2 = new Entregador(1, "Maria", "987.654.321-00", "43 88888-9999", "Carro", "DEF-5678", "654321", "B");
        entregadores.add(entregador2);

        int opcao;
        int idCliente = 0;
        Scanner sc = new Scanner(System.in);
        String menu = """
                1 - Cadastrar cliente
                2 - Listar pessoa
                3 - Visualizar pessoa
                4 - Excluir pessoa
                5 - Editar pessoa
                6 - Pedidos
                7 - Gerar relatório
                """;


        do {
            System.out.println(menu);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.setId(idCliente);
                    System.out.println("Digite o nome do cliente: ");
                    cliente.setNome(sc.next());
                    System.out.println("Digite o endereço do cliente: ");
                    cliente.setEndereco(sc.next());
                    System.out.println("Digite o email do cliente: ");
                    cliente.setEmail(sc.next());
                    System.out.println("Digite o telefone do cliente: ");
                    cliente.setTelefone(sc.next());
                    System.out.println("Digite o cpf do cliente: ");
                    cliente.setCpf(sc.next());
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    idCliente++;
                    break;
                case 2:
                    System.out.println("Listar: ");
                    System.out.println("""
                            1 - Clientes
                            2 - Entregadores
                            """);

                    int opcaoListar = sc.nextInt();

                    if (opcaoListar == 1) {
                        System.out.println("Listando clientes...");
                        for (Cliente lista : clientes) {
                            System.out.println(lista);
                        }
                    } else if (opcaoListar == 2) {
                        System.out.println("Listando entregadores...");
                        for (Entregador entregador : entregadores) {
                            System.out.println(entregador);
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Visualizar: ");
                    System.out.println("""
                            1 - Cliente
                            2 - Entregador
                            """);

                    int opcaoVisualizar = sc.nextInt();

                    if (opcaoVisualizar == 1) {
                        System.out.println("Digite o id do cliente: ");
                        int id = sc.nextInt();
                        Cliente clienteId = clientes.get(id);
                        System.out.println("Visualizando cliente " + clienteId.toString());
                    } else if (opcaoVisualizar == 2) {
                        System.out.println("Digite o id do entregador: ");
                        int id = sc.nextInt();
                        Entregador entregador = entregadores.get(id);
                        System.out.println("Visualizando entregador " + entregador.toString());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 4:
                    System.out.println("Excluir: ");
                    System.out.println("""
                            1 - Cliente
                            2 - Entregador
                            """);

                    int opcaoExcluir = sc.nextInt();

                    if (opcaoExcluir == 1) {
                        System.out.println("Digite o id do cliente: ");
                        int id = sc.nextInt();
                        Cliente clienteId = clientes.get(id);
                        System.out.println("Excluindo cliente " + clienteId.getNome());
                        clientes.remove(clienteId);
                    } else if (opcaoExcluir == 2) {
                        System.out.println("Digite o id do entregador: ");
                        int id = sc.nextInt();
                        Entregador entregadorId = entregadores.get(id);
                        System.out.println("Excluindo entregador " + entregadorId.getNome());
                        entregadores.remove(entregadorId);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 5:
                    System.out.println("Editar: ");
                    System.out.println("""
                            1 - Cliente
                            2 - Entregador
                            """);

                    int opcaoEditar = sc.nextInt();

                    if  (opcaoEditar == 1) {
                        System.out.println("Digite o id do cliente: ");
                        int id = sc.nextInt();
                        Cliente clienteId = clientes.get(id);
                        System.out.println("Editando cliente " + clienteId.getNome());
                        System.out.println("Nome: ");
                        clienteId.setNome(sc.next());
                        System.out.println("Endereço: ");
                        clienteId.setEndereco(sc.next());
                        System.out.println("Email: ");
                        clienteId.setEmail(sc.next());
                        System.out.println("Telefone: ");
                        clienteId.setTelefone(sc.next());
                        System.out.println("CPF: ");
                        clienteId.setCpf(sc.next());
                    } else if (opcaoEditar == 2) {
                        System.out.println("Digite o id do entregador: ");
                        int id = sc.nextInt();
                        Entregador entregadorId = entregadores.get(id);
                        System.out.println("Editando entregador " + entregadorId.getNome());
                        System.out.println("Nome: ");
                        entregadorId.setNome(sc.next());
                        System.out.println("CPF: ");
                        entregadorId.setCpf(sc.next());
                        System.out.println("Telefone: ");
                        entregadorId.setTelefone(sc.next());
                        System.out.println("Veículo: ");
                        entregadorId.setVeiculo(sc.next());
                        System.out.println("Placa: ");
                        entregadorId.setPlaca(sc.next());
                        System.out.println("CNH: ");
                        entregadorId.setCnh(sc.next());
                        System.out.println("Categoria: ");
                        entregadorId.setCategoria(sc.next());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 6:
                    System.out.println("Pedidos: ");
                    System.out.println("""
                            1 - Fazer pedido
                            2 - Listar pedidos
                            3 - Visualizar pedido
                            """);

                    int opcaoPedido = sc.nextInt();

                    if (opcaoPedido == 1) {
                        int menuPedido;
                        Pedido pedido = new Pedido();
                        double precoTotal = 0;

                        System.out.println("""
                                Escolha o restaurante:
                                1 - Burger King
                                2 - McDonalds
                                """);
                        int opcaoRestaurante = sc.nextInt();
                        if (opcaoRestaurante == 1) {
                            pedido.setRestaurante(burgerKing);
                        } else if (opcaoRestaurante == 2) {
                            pedido.setRestaurante(mcDonalds);
                        } else {
                            System.out.println("Opção inválida!");
                            break;
                        }
                        do {
                            System.out.println("Escolha o lanche: ");
                            int lanche;
                            if (opcaoRestaurante == 1) {
                                System.out.println("""
                                        1 - Whopper + Refill (R$ 21,90)
                                        2 - Combo Chicken Crispy (R$ 29,90)
                                        """);
                                lanche = sc.nextInt();
                            } else {
                                System.out.println("""
                                        1 - Big Tasty (R$ 31,90)
                                        2 - McCrispy Chicken (R$ 29,90)
                                        """);
                                lanche = sc.nextInt();
                                lanche += 2;
                            }
                            itemPedido item = new itemPedido();
                            if (lanche == 1) {
                                item.setNome("Whopper + Refill");
                                item.setPreco(21.90);
                                pedido.addItem(item);
                            } else if (lanche == 2) {
                                item.setNome("Combo Chicken Crispy");
                                item.setPreco(29.90);
                                pedido.addItem(item);
                            } else if (lanche == 3) {
                                item.setNome("Big Tasty");
                                item.setPreco(31.90);
                                pedido.addItem(item);
                            } else if (lanche == 4) {
                                item.setNome("McCrispy Chicken");
                                item.setPreco(29.90);
                                pedido.addItem(item);
                            } else {
                                System.out.println("Opção inválida!");
                                break;
                            }
                            System.out.println("Digite a quantidade: ");
                            int quantidade = sc.nextInt();
                            double subTotal = item.getPreco() * quantidade;
                            item.setQuantidade(quantidade);
                            precoTotal+= subTotal;
                            System.out.println("""
                                    Deseja adicionar mais itens?
                                    1 - Sim
                                    0 - Não
                                    """);
                            menuPedido = sc.nextInt();
                        } while (menuPedido != 0);
                        pedido.setPrecoTotal(precoTotal);
                        System.out.println("Digite o seu ID: ");
                        Cliente clienteId = clientes.get(sc.nextInt());
                        pedido.setCliente(clienteId);
                        pedidos.add(pedido);
                        clienteId.addPedido(pedido);
                        System.out.println("""
                                Como deverá ser sua entrega?
                                1 - Moto (R$ 5,00)
                                2 - Carro (R$ 8,00)
                                """);
                        int opcaoEntrega = sc.nextInt();
                        Entrega entrega = new Entrega();
                        if (opcaoEntrega == 1) {
                            entrega.setData("12/12/2024");
                            entrega.setHora("12:00");
                            entrega.setStatus("Finalizado");
                            entrega.setValor(5.00);
                            entrega.setPedido(pedido);
                            entregador1.addEntrega(entrega);
                        } else if (opcaoEntrega == 2) {
                            entrega.setData("12/12/2024");
                            entrega.setHora("12:00");
                            entrega.setStatus("Finalizado");
                            entrega.setValor(8.00);
                            entrega.setPedido(pedido);
                            entregador2.addEntrega(entrega);
                        } else {
                            System.out.println("Opção inválida!");
                            break;
                        }
                        System.out.println("Pedido cadastrado com sucesso!");
                        break;
                    } else if (opcaoPedido == 2) {
                        System.out.println("Listando pedidos...");
                        for (Pedido pedido : pedidos) {
                            System.out.println(pedido.toString());
                        }
                    } else if (opcaoPedido == 3) {
                        System.out.println("Digite o id do pedido: ");
                        int id = sc.nextInt();
                        Pedido pedido = pedidos.get(id);
                        System.out.println("Visualizando pedido " + pedido.toString());
                    } else {
                        System.out.println("Opção inválida!");
                        break;
                    }
                    break;
                case 7:
                    System.out.println("Gerar relatório: ");
                    System.out.println("""
                            1 - Cliente
                            2 - Entregador
                            """);

                    int opcaoRelatorio = sc.nextInt();

                    if (opcaoRelatorio == 1) {
                        System.out.println("Digite o id do cliente: ");
                        int id = sc.nextInt();
                        Cliente clienteId = clientes.get(id);
                        System.out.println("Gerando relatório do cliente " + clienteId.getNome());
                        System.out.println(clienteId.gerarRelatorio());
                    } else if (opcaoRelatorio == 2) {
                        System.out.println("Digite o id do entregador: ");
                        int id = sc.nextInt();
                        Entregador entregadorId = entregadores.get(id);
                        System.out.println("Gerando relatório do entregador " + entregadorId.getNome());
                        System.out.println(entregadorId.gerarRelatorio());
                    } else {
                        System.out.println("Opção inválida!");
                        break;
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
