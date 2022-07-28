import java.util.Scanner;

public class Clowns_Black_Deliveriy {
    public static void main(String[] args) {
        Banco_dados_app banco_dados_app = new Banco_dados_app();
        while ((true)) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("__________________________________________________________________________________________");
            System.out.println("Clowns_Black_Deliveriy                               [1]Cadastro_loja [2]Castro_cliente   |");
            System.out.println("                                                     [3]Login_cliente [4]Login_loja       |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.println("                                                                                          |");
            System.out.print("<<< Digite uma opção que esteja aqui acima >>> ");
            int escolha_usuario = entrada.nextInt();
            
            switch (escolha_usuario) {
                case 1:
                    System.out.print("Digite nome do seu restaurante :");
                    String nome_loja = entrada.next();
                    System.out.print("Digite o cnpj do seu restaurante :");
                    int cnpj_loja = entrada.nextInt();
                    System.out.print("Digite nome da rua do seu  restaurante :");
                    String rua_restaurante = entrada.next();
                    banco_dados_app.Cadastrado_lojas(nome_loja, cnpj_loja, rua_restaurante);
                    System.out.println(banco_dados_app.cadastrado_lojas);
                    continue;
                case 2:
                    System.out.print("Digite seu nome :");
                    String nome_cliete = entrada.next();
                    System.out.print("Digite seu  cpf :");
                    int cpf_cliente = entrada.nextInt();
                    System.out.print("Digite nome da rua do seu  barraco :");
                    String rua_do_cliente = entrada.next();
                    System.out.print("Digite numero do barraco");
                    int numero_rua = entrada.nextInt();
                    banco_dados_app.Cadastro_cliente(nome_cliete, cpf_cliente, rua_do_cliente, numero_rua);
                    continue;
                case 3:
                    while (true) {
                        System.out.print("Digite seu nome :");
                        String NOME_LOGIN = entrada.next();
                        System.out.println(banco_dados_app.nomes_login_clientes1);
                        if (banco_dados_app.nomes_login_clientes1.contains(NOME_LOGIN)) {
                            System.out.println("passei aqui .");
                            while (true) {
                                System.out.println("__________________________________________________________________________________________");
                                System.out.println("Clowns_Black_Deliveriy                        [1]ver_cardapio [2]Sair [3]Finalizar compra |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.print("<<< Digite uma opção que esteja aqui acima >>> ");
                                int escolha = entrada.nextInt();
                                if (escolha == 1) {
                                    System.out.println("Qual tipo de produto você quer ver ?");
                                    System.out.print("<< [1]Lanche >> << [2]Bebida >> << [3]Sair >> ");
                                    int escolha_ver = entrada.nextInt();
                                    if (escolha_ver == 1){
                                        banco_dados_app.mostra_rcardapio_lanche();
                                    }
                                    if(escolha_ver == 2){
                                        banco_dados_app.mostra_rcardapio_bebida();
                                    }
                                }
                                if (escolha == 2) {
                                    break;
                                }
                                if (escolha == 3){
                                    banco_dados_app.cupom_fiscal();
                                    System.out.println("<<< Obrigado pela preferencia >>>");
                                    break;
                                }else {
                                    continue;
                                }
                            }
                            break;
                        } else {
                            continue;
                        }

                    }
                case 4:
                    while (true){
                        System.out.print("Digite nome do seu restaurante :");
                        String NOME_LOGIN = entrada.next();
                        if (banco_dados_app.nomes_login_lojas.contains(NOME_LOGIN)) {
                            while (true) {
                                System.out.println("__________________________________________________________________________________________");
                                System.out.println("Clowns_Black_Deliveriy         "+NOME_LOGIN+"                [1]cadastrada_lanche [2]Sair |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.println("                                                                                          |");
                                System.out.print("<<< Digite uma opção que esteja aqui acima >>> ");
                                int escolha = entrada.nextInt();
                                if (escolha == 1) {
                                    System.out.println("Qual tipo de produto?");
                                    System.out.print("<< [1]Lanche >> << [2]Bebida >> << [3]Sair >> ");
                                    int escolha_cardapio = entrada.nextInt();
                                    if (escolha_cardapio == 1){
                                        System.out.print("<<< Qual nome do lanche ? >>>");
                                        String nome_lanche = entrada.next();
                                        System.out.print("<<< Qual sera o valor? >>>");
                                        float preco_lanche = entrada.nextFloat();
                                        System.out.print("<<< Qual sera a quantidade de lanche pra venda ? >>>");
                                        int quantidade_lanche = entrada.nextInt();
                                        banco_dados_app.cadastrar_Lanches_restaurante(NOME_LOGIN,nome_lanche,preco_lanche,quantidade_lanche);
                                        System.out.println(banco_dados_app.cardapio_lanches);
                                    }
                                    if (escolha_cardapio == 2){
                                        System.out.print("<<< Qual nome do bebida ? >>>");
                                        String nome_bebida = entrada.next();
                                        System.out.print("<<< Qual sera o valor? >>>");
                                        float preco_bebida = entrada.nextFloat();
                                        System.out.print("<<< Qual sera a quantidade de bibidas pra venda ? >>>");
                                        int quantidade_bebida = entrada.nextInt();
                                        banco_dados_app.cadastrar_Bebidas_restaurante(NOME_LOGIN,nome_bebida,preco_bebida,quantidade_bebida);
                                    }
                                    if (escolha_cardapio == 3) {
                                        break;
                                    }
                                    else {
                                        continue;
                                    }

                                }
                                if (escolha == 2) {
                                    break;
                                } else {
                                    continue;

                                }

                        }
                            break;
                    } else {
                        continue;
                    }
                    }

                }
            }
        }

    }
