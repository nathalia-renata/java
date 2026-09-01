
import java.util.Scanner;

public class CondicionalDois {
    public static void main(String[] args) {
        System.out.println("Digite 1 se for cliente e 2 se não for: ");
        System.out.println("1 - Cliente");
        System.out.println("2- Não é Cliente");
        Scanner digite = new Scanner(System.in);
        int opcao = digite.nextInt();
        switch(opcao){
            case 1:
            System.out.println("É cliente");
            break;
            case 2:
            System.out.println(" Não é cliente");
            System.out.println("Crie seu login");
            break;
            default:
            System.out.println("Opção invalida");
            break;
        }
        
    }
}
