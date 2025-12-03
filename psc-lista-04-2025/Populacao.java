//import java.util.Scanner;
public class Populacao {
    public static void main(String[] args) {
         int populacaoPaisA = 80000, populacaoPaisB = 200000, anos = 0;
         double taxaA = 0.03, taxaB = 0.015, crescimentoA, crescimentoB;

         System.out.println("População inicial do país A: " + populacaoPaisA);
         System.out.println("População inicial do país B: " + populacaoPaisB);

         while(populacaoPaisA < populacaoPaisB){
             crescimentoA = populacaoPaisA*taxaA;
             populacaoPaisA += crescimentoA;
             crescimentoB = populacaoPaisB*taxaB;
             populacaoPaisB += crescimentoB;
             anos ++;
         }
         System.out.println("População final do país A: " + populacaoPaisA);
         System.out.println("População final do país B: " +populacaoPaisB);
         System.out.println("Total de anos para que a população do país A alcance a população do país B: " + anos + " anos.");

    }}
        //Com alteração para entrada de dados:
        
    //     int populacaoPaisA, populacaoPaisB, anos=0;
    //     double taxaA, taxaB, crescimentoA, crescimentoB;
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Digite a população inicial do país A: ");
    //     populacaoPaisA = scanner.nextInt();

    //     System.out.println("Digite a taxa de crescimento do país A (%): ");
    //     taxaA = scanner.nextDouble();

    //     System.out.println("Digite a população inicial do país B: ");
    //     populacaoPaisB = scanner.nextInt();

    //     System.out.println("Digite a taxa de crescimento do país B (%): ");
    //     taxaB = scanner.nextDouble();


    //      while(populacaoPaisA < populacaoPaisB){
    //          crescimentoA = populacaoPaisA*(taxaA/100);
    //          populacaoPaisA += crescimentoA;
    //          crescimentoB = populacaoPaisB*(taxaB/100);
    //          populacaoPaisB += crescimentoB;
    //          anos ++;
    //      }
    //      System.out.println("População final do país A: " + populacaoPaisA);
    //      System.out.println("População final do país B: " +populacaoPaisB);
    //      System.out.println("Total de anos para que a população do país A alcance a população do país B: " + anos + " anos.");

    //      scanner.close();

    // }

