import java.util.Scanner;
public class Usuariosenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        System.out.println("Digite o seu nome de usuário: ");
        usuario = scanner.next();

        System.out.println("Digite a sua senha: ");
        senha = scanner.next();

        while(usuario.equals(senha)){
            System.out.println("Erro! O nome de usuário e a senha não podem ser iguais.");

            System.out.println("Digite o seu nome de usuário: ");
            usuario = scanner.next();

            System.out.println("Digite a sua senha: ");
            senha = scanner.next();
        }

        System.out.println("Novo usuário cadastrado.\nUsuário: " + usuario + "\nSenha: " + senha);
        scanner.close();

    }
}
