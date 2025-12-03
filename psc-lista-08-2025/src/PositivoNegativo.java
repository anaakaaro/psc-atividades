import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        
        System.out.println("Digite um número:");
        System.out.println("Se o número for maior que 0 o programa retorna P");
        System.out.println("Se o número for menor ou igual a 0 o programa retorna N");
        a = scanner.nextInt();
        verificarNumero(a);
        
        scanner.close();
    }

    public static void verificarNumero(int a){
        if(a <= 0){
            System.out.println("N");
        } else {
            System.out.println("P");
        }
    }
}
