import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main() {

        Main main = new Main();
        String opcoes;
        int opcao;
        String usuario, senha, user = null, pass = null;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("1 - Login\n2 - Register\n3 - Quit");
            opcoes = input.next();
            switch (opcoes) {

                case "1" :
                    do {
                        System.out.println("<< Login >>\n1 - voltar\nUser: ");
                        usuario = input.next();
                        System.out.println("Password: ");
                        senha = input.next();
                        if ((Objects.equals(usuario, user)) && (Objects.equals(pass, senha))) {
                            opcao = 3;
                            Main.inicio();
                        } else if ((!Objects.equals(usuario, user)) || (!Objects.equals(pass, senha))) {
                            System.out.println("User or Password invalid, try again.\n");
                        }
                    } while ((!Objects.equals(usuario, user)) || (!Objects.equals(pass, senha)));
                    break;

                case "2" :
                    System.out.println("<< Register >>\n1 - voltar\nUser: ");
                    user = input.next();
                    System.out.println("Password: ");
                    pass = input.next();
                    break;

                case "3" :
                    System.out.println("ENCERRANDO...");
                    break;

                default:
                    System.out.println("Invalid Option, try again.");

            }
            /*O LOGIN COM IF E ELSE FICOU MUITO BAGUNÇADO E ALTEREI PARA O SWITCH CASE, PORÉM OS DOIS DA PRA UTILIZAR
            MAS O IF E ELSE DEVE USAR MUITA MEMÓRIA.

            if (opcao > 3) {
                System.out.println("Invalid Option, try again.");
            } else if (opcao == 2) {
                System.out.println("<< Register >>\n1 - voltar\nUser: ");
                user = input.next();
                System.out.println("Password: ");
                pass = input.next();
            } else if (opcao == 1) {
                do {
                    System.out.println("<< Login >>\n1 - voltar\nUser: ");
                    usuario = input.next();
                    System.out.println("Password: ");
                    senha = input.next();
                    if ((Objects.equals(usuario, user)) && (Objects.equals(pass, senha))) {
                        opcao = 3;
                        Main.inicio();
                    } else if ((!Objects.equals(usuario, user)) || (!Objects.equals(pass, senha))) {
                        System.out.println("User or Password invalid, try again.\n");
                    }

                } while ((!Objects.equals(usuario, user)) || (!Objects.equals(pass, senha)));
            }
*/
        } while (!opcoes.equals(String.valueOf(3)));
    }
}
