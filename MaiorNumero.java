import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, num4, num5, maiorNumero;

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

        maiorNumero = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();


    }
}
