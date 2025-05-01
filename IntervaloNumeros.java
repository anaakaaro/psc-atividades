import java.util.Scanner;
public class IntervaloNumeros {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        if(num2>num1){
            System.out.println("Números inteiros no intervalo entre " + num1 + " e " + num2 + ":");
        } else{
            System.out.println("Números inteiros no intervalo entre " + num2 + " e " + num1 + ":");
        }
        
        for(int i = inicio; i < fim; i++){
            System.out.println(i);
        }
        scanner.close();    
        }
}

