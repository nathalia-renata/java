
import java.util.Scanner;
public class LacoWhile {
   public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int condicao = 1;
        while (condicao != 0){
            System.out.println("Digite um nome:");
            String nome = ler.next();
            System.out.println("0 para parar");
            condicao = ler.nextInt();
        }

   } 
}