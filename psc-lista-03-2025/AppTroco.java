import java.util.Scanner;

public class AppTroco {
    public static void main(String[] args) {
        
        int valorDaCompra, valorPago, troco;
        //nota50, nota20, nota10, nota5, nota2, nota1; 
        //int []notasAceitas = {50,20,10,5,2,1};
        int notas50=0, notas20=0, notas10=0, notas5=0, notas2=0, notas1=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        valorDaCompra = scanner.nextInt();

        System.out.println("Digite o valor pago: ");
        valorPago = scanner.nextInt();

        troco = valorPago - valorDaCompra;

        if (valorPago < valorDaCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
        } else{System.out.println("Troco a receber: R$" + troco);}

        while (troco>=50) {
            notas50 ++;
            troco -= 50;
        }

        while (troco>=20) {
            notas20 ++;
            troco -= 20;
        }

        while (troco>=10) {
            notas10 ++;
            troco -= 10;
        }

        while (troco>=5) {
            notas5 ++;
            troco -= 5;
        }

        while (troco>=2) {
            notas2 ++;
            troco -= 2;
        }

        while (troco>=1) {
            notas1 ++;
            troco -= 1;
        }

        System.out.println("Valor pago: R$" + valorPago);
        System.out.println("Valor da compra: R$" + valorDaCompra);
        System.out.println("Notas de R$50,00: " + notas50);
        System.out.println("Notas de R$20,00: " + notas20);
        System.out.println("Notas de R$10,00: " + notas10);
        System.out.println("Notas de R$5,00: " + notas5);
        System.out.println("Notas de R$2,00: " + notas2);
        System.out.println("Notas de R$1,00: " + notas1);

        scanner.close();
    }
}
