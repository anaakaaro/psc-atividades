import java.util.Scanner;

class LerNumeros{
    public static void main(String[] args) {
        int numero1, numero2, numero3, maiorNumero, menorNumero, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        maiorNumero = Math.max(numero1, Math.max(numero2,numero3));
        menorNumero = Math.min(numero1, Math.min(numero2, numero3));
        media = (numero1+numero2+numero3)/3;

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);
        System.out.println("A média dos números é: " + media);

        scanner.close();

        
       
    }
}