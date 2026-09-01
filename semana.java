
import java.util.Scanner;

public class semana {
   public static void main(String[] args) {
    System.out.println("Digite de 1 a 7 determinando o dia da semana que será sua folga:");
    System.out.println("1 - Domingo");
    System.out.println("2 - Segunda - Feira");
    System.out.println("3 - Terça - Feira");
    System.out.println("4 - Quarta - Feira");
    System.out.println("5 - Quinta - Feira");
    System.out.println("6 - Sexta - Feira");
    System.out.println("7 - Sábado - Feira");
    Scanner leitor = new Scanner(System.in);
    int opcao = leitor.nextInt();
    switch(opcao){
        case 1: 
        System.out.println("Domingo");
        break;
        case 2: 
        System.out.println("Segunda");
        break;
        case 3: 
        System.out.println("Terça");
        break;
        case 4: 
        System.out.println("Quarta");
        break;
        case 5: 
        System.out.println("Quinta");
        break;
        case 6: 
        System.out.println("Sexta");
        break;
        case 7: 
        System.out.println("Sábado");
        break;
        default:
        System.out.println("Opção invalida");
        break;

    }
    
   } 
}
