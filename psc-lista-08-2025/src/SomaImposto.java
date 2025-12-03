import java.util.Scanner;

public class SomaImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxaImposto, custo;

        System.out.println("Digite o custo do produto: ");
        custo = scanner.nextDouble();

        System.out.println("Digite o custo do imposto (em porcentagem): ");
        taxaImposto = scanner.nextDouble();

        double somaImposto = somaImposto(taxaImposto, custo);
        System.out.println("Valor de custo com imposto: " + somaImposto);

        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo){
        double imposto = custo * (taxaImposto/100);
        return imposto + custo;
        
    }
}
