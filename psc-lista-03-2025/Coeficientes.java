import java.util.Scanner;

public class Coeficientes {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        a = scanner.nextInt();

        System.out.println("Digite o coeficiente b: ");
        b = scanner.nextInt();

        System.out.println("Digite o coeficiente c: ");
        c = scanner.nextInt();

        double delta = b * b -4 * a * c;

        if(a==0 && b==0 && c!=0){
            System.out.println("Coeficientes informados incorretamente.0");
        } else if(a==0 && b!=0){
            System.out.println("Essa é uma equação de primeiro grau");
            double raiz = -c/b;
            System.out.println("Raiz real da equação: " + raiz);
        } else if (delta < 0){
            System.out.println("Esta equação não possui raízes reais.");
        } else if(delta == 0){
            System.out.println("Esta equação possui duas raízes reais iguais.");
            double raiz = -b  / (2 * a);
            System.out.println("Raiz real da equação: " + raiz);
        } else if (delta > 0){
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            double raiz1 = (-b + delta) / (2*a);
            double raiz2 = (-b - delta) / (2*a);
            System.out.println("Valor da raiz 1: " + raiz1);
            System.out.println("Valor da raiz 2: " + raiz2);
        }
        scanner.close();

    }
}
