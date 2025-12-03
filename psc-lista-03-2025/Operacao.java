import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {
        String simbolo = ""; 
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Agora, digite o símbolo de operação que desejar: ");
        simbolo = input.nextLine();

        if(simbolo.equals("+")){
            double soma = num1 + num2;
            System.out.println("O resultado da soma é: " + soma);
        }else if(simbolo.equals("-")){
            double subtracao = num1 - num2;
            System.out.println("O resultado da subtração é: " + subtracao);
        }else if(simbolo.equals("*")){
            double multiplicacao = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + multiplicacao);
        }else if(simbolo.equals("/")){
            double divisao = num1 / num2;
            System.out.println("O resultado da divisão é: " + divisao);
        }else if(simbolo.equals("^")){
            double potencia = Math.pow(num1, num2);
            System.out.println("O resultado da potência é: " + potencia);
        }else{
            System.out.println("Erro! O símbolo da operação é inválido.");
        }

        scanner.close();
        input.close();
        
}
}

