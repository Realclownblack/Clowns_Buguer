import java.util.ArrayList;
import java.util.Scanner;

public class Banco_dados_app {
Scanner Entrada = new Scanner(System.in);
        ArrayList<loja> cadastrado_lojas = new ArrayList<>();
        ArrayList<cliente> cadastro_cliente = new ArrayList<>();
        ArrayList<String> nomes_login_clientes1 = new ArrayList<>();
        ArrayList<String> nomes_login_lojas = new ArrayList<>();
        ArrayList<Cardapio_restaurante>cardapio_bebidas = new ArrayList<>();
        ArrayList<Cardapio_restaurante>cardapio_lanches = new ArrayList<>();
        ArrayList<String> lista_compra = new ArrayList<>();
        ArrayList<Float>valor_lista = new ArrayList<>();
        public void Cadastrado_lojas(String nome_loja, int cnpj_valido, String Nome_rua){
                loja loja1 = new loja(nome_loja, cnpj_valido, Nome_rua);
                cadastrado_lojas.add(loja1);
                nomes_login_lojas.add(nome_loja);


        }
        public void Cadastro_cliente(String nome_cliente,int cpf_valido,String nome_rua_cliente,int numero_rua){
             cliente cliente1 = new cliente(nome_cliente,cpf_valido,nome_rua_cliente,numero_rua);
             cadastro_cliente.add(cliente1);
             nomes_login_clientes1.add(nome_cliente);
        }
        public void cadastrar_Bebidas_restaurante(String nome_restaurante,String nome_produto,float preco_produto,int quantidade){
            Cardapio_restaurante cardapio_restaurante = new Cardapio_restaurante( nome_restaurante,nome_produto, preco_produto,quantidade);
            cardapio_bebidas.add( cardapio_restaurante);
        }
        public void cadastrar_Lanches_restaurante(String nome_restaurante,String nome_produto,float preco_produto,int quantidade){
                Cardapio_restaurante cardapio_restaurante = new Cardapio_restaurante( nome_restaurante,nome_produto, preco_produto,quantidade);
                cardapio_lanches.add(cardapio_restaurante);
        }
        public  void mostra_rcardapio_lanche(){
            for (Cardapio_restaurante lanches:cardapio_lanches) {
                while (true){
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("Restaurante = "+lanches.nome_restaurante);
                    System.out.println(lanches.nome_produto + " = Valor : " + lanches.preco_produto );
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.print(" <<< Deseija compra esse intem [S/n] ou Sair do cardapio [1] >>>");
                    String escolha_pedido = Entrada.next();
                    if (escolha_pedido.equals("s")){
                        lista_compra.add(lanches.nome_produto+ " = "+lanches.preco_produto + " Produtos do restaurante " + lanches.nome_restaurante);
                         valor_lista.add(lanches.preco_produto);
                        System.out.println("pasei");
                         break;
                    }
                    if (escolha_pedido.equals("n")){
                        break;
                    }
                    if (escolha_pedido.equals("1")) {
                        break;
                    }
                }

            }
        }
        public  void mostra_rcardapio_bebida(){
                for (Cardapio_restaurante bebida:cardapio_lanches) {
                    while (true){
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println(bebida.nome_restaurante);
                    System.out.println(bebida.nome_produto + ":" + bebida.preco_produto + "Quantidade Disponiveis : " + bebida.quantidade);
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.print(" <<< Deseija compra esse intem [S/n] ou Sair do cardapio [1] >>>");
                    String escolha_pedido = Entrada.next();
                    if (escolha_pedido.equals("s")){
                        lista_compra.add(bebida.nome_produto+ " = "+bebida.preco_produto + " Produtos do restaurante " + bebida.nome_restaurante);
                        valor_lista.add(bebida.preco_produto);
                        break;
                    }
                    if (escolha_pedido.equals("n")){
                        break;
                    }
                    if (escolha_pedido.equals("1")) {
                        break;
                    }
            }
            }
        }
        public void cupom_fiscal(){
            for (String i: lista_compra) {
                System.out.println(i);
            }
            float total = 0;
            for (float i:valor_lista) {
                total += i;
            }
            System.out.println("Valor total da compra : "+total);
        }
}
