import java.util.Scanner;
import java.util.Random;
public class Sorteio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, num3 = random.nextInt(1000), menorNumero, maiorNumero, numeroPar;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        menorNumero = Math.min(num1, num2);
        maiorNumero = Math.max(num1, num2);
        num3 = random.nextInt(menorNumero, maiorNumero);
        numeroPar = num3 % 2;

        if(numeroPar == 0 ){
            System.out.println("Número gerado: " + num3);
            System.out.println("O número gerado é par.");
        } else {
            System.out.println("Número gerado: " + num3);
            System.out.println("O número gerado é ímpar.");
        }

        scanner.close();
        
    }
}
