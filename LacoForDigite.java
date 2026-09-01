import java.util.Scanner;
public class LacoForDigite {
    public static void main(String[] args) {
        System.out.print("Digite um número para calcular de 1 á 10: ");
        Scanner digite = new Scanner(System.in);
        int num = digite.nextInt();
        for (int i = 1; i <= 10 ; i++) {
        System.out.println(num+ "x" +i + "=" + i* num); 
        
        }
    }
}
