import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
       double indicador, raio;
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o indicador de operação: ");
        indicador = scanner.nextDouble();

        System.out.println("Digite o raio do círculo ou esfera: ");
        raio = scanner.nextDouble();

        if(indicador == 1){
            double perimetro = 2 * 3.141592 * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if(indicador == 2){
            double area = 3.141592 * (raio*raio);
            System.out.println("Área do círculo: " + area);
        } else if(indicador == 3){
            double volume = 4 / 3 * 3.141592 * (Math.pow(raio,3));
            System.out.println("Volume da esfera: " + volume);
        } else{
            System.out.println("Erro! O código da operação é inválido.");
        }
        scanner.close();
    } 
    
}
