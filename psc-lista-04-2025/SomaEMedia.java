import java.util.Scanner;
public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, num5, soma, media;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextDouble();

        System.out.println("Digite o quarto número: ");
        num4 = scanner.nextDouble();

        System.out.println("Digite o quinto número: ");
        num5 = scanner.nextDouble();

        soma = num1 + num2 + num3 + num4 + num5;
        media = (soma/5);

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
