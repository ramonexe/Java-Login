import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main() {

        Main main = new Main();
        int opcao;
        String usuario, senha, user = null, pass = null;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("1 - Login\n2 - Register\n3 - Quit");
            opcao = input.nextInt();
            if (opcao > 3) {
                System.out.println("Invalid Option, try again.");
            } else if (opcao == 2) {
                System.out.println("<< Register >>\nUser: ");
                user = input.next();
                System.out.println("Password: ");
                pass = input.next();
            } else if (opcao == 1) {
                do {
                    System.out.println("<< Login >>\nUser: ");
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

        } while ((opcao != 3));
    }
}
