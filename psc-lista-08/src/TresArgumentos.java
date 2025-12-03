import java.util.Scanner;

public class TresArgumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, soma;

        System.out.println("Digite o primeiro número: ");
        a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        b = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        c = scanner.nextInt();

        soma = somaTresArgumentos(a, b, c);
        System.out.println("Resultado da soma:" + soma);

        scanner.close();
    }

    public static int somaTresArgumentos(int a, int b, int c){
        return a + b + c;
    }
}
