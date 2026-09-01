
import java.util.Scanner;
public class IfElse{
    public static void main(String[] args) {
        System.out.println("Digite um número impar ou par:");
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();
        if (opcao % 2 == 0){
            System.out.println( " É PAR");
        } else{
            System.out.println( "É impar");
        }

        }
}