import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);
        System.out.println("Digite 3 números: ");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        int soma = num1 + num2 + num3;
        System.out.print("O resultado é : " + soma);

    }
}
