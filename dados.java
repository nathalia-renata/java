import java.util.Scanner;
public class dados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);


    }
}
