import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        double salario;
        String nome;
        char sexo, estadoCivil;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        //tamanhoDoNome = nome.length();

        while((nome.length())<=3){
            System.out.println("Erro! O nome deve ter mais de 3 caracteres.");
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
        }

        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        while(idade <0 || idade >150){
            System.out.println("Erro! A idade deve estar entre 0 e 150.");
            System.out.println("Digite a sua idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Digite o seu salário: ");
        salario = scanner.nextDouble();

        while(salario <0){
            System.out.println("Erro! O salário deve ser maior que 0.");
            System.out.println("Digite o seu salário: ");
            salario = scanner.nextDouble();
        }

        System.out.println("Digite o seu sexo: ");
        sexo = scanner.next().charAt(0);

        while(sexo != 'f' && sexo != 'm'){
            System.out.println("Erro! O sexo deve ser F - Feminino ou M - Masculino.");
            System.out.println("Digite o seu sexo: ");
            sexo = scanner.next().charAt(0);
        }

        System.out.println("Digite o seu estado civil: ");
        estadoCivil = scanner.next().charAt(0);

        while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println("Erro! O seu estado civil deverá ser apenas uma das seguintes opções:\nS - Solteiro(a)\nC - Casado(a)\nV - Viuvo(a)\nD - Divorciado(a)");
            System.out.println("Digite o seu estado civil: ");
            estadoCivil = scanner.next().charAt(0);
        }
        System.out.println("Cadastro concluido.");
        
        scanner.close();
    }  
}
