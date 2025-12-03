import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota de zero a dez: ");
        nota = scanner.nextInt();

        while(nota <0 || nota>10){
            System.out.println("Valor inválido!"); 
            System.out.println("Digite umma nota de zero a dez: ");
            nota = scanner.nextInt();
        }
        System.out.println("A sua nota é: " + nota);

        scanner.close();
    }
}
