
import java.util.Scanner;
public class Condicional{
   public static void main(String[] args) {
    System.out.println("Idade: ");
    try (Scanner ler = new Scanner(System.in)) {
        int idade = ler.nextInt();
        if (idade >= 18){
            System.out.println("Maior");
        } else {
            System.out.println( "Menor");
        }
    }
   } 

}