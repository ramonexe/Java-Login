import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Login.main();
    }

    public static void inicio() {

        ArrayList<String> produtos = new ArrayList<String>();
        ArrayList<Integer> codigos = new ArrayList<Integer>();
        String opcao = null;
        System.out.println("\nLogged!\n");
        Scanner input = new Scanner(System.in);
            do {
                System.out.println("---COOPSTOCK MENU---\n" +
                        "1 - CADASTRAR PRODUTO\n" +
                        "2 - CONSULTAR PRODUTO\n" +
                        "3 - ENTRADA DE PRODUTOS\n" +
                        "4 - SAIDA DE PRODUTOS\n" +
                        "5 - RELATÓRIO GERAL\n" +
                        "6 - sair\n");
                opcao = input.next();

                switch (opcao) {
                    case "1":
                        System.out.println("\n--CADASTRAR PRODUTO--\n" +
                                "Nome do Produto: ");
                        produtos.add(input.next());
                        System.out.println("Código do Produto: ");
                        codigos.add(input.nextInt());
                        break;
                    case "2":
                        System.out.println("\n--CONSULTAR PRODUTO--\n");
                        break;
                    case "3":
                        System.out.println("\n--ENTRADA DE PRODUTOS--\n");
                        break;
                    case "4":
                        System.out.println("\n--SAIDA DE PRODUTOS--\n");
                        break;
                    case "5":
                        System.out.println("\n--RELATÓRIO GERAL--\n");
                        for (String todosProdutos : produtos) {
                            System.out.println(todosProdutos);
                        }
                        System.out.println("\nInsira qualquer botão para voltar\n");
                        input.next();
                        break;
                    case "6":
                        System.out.println("COOPSTOCK ENCERRANDO...");
                        Login.main();
                        break;
                    default:
                        System.out.println("Você não escolheu nenhuma opção");
                        break;
                }
            } while (!opcao.equals(String.valueOf(6)));
        }
    }