public class ArrayMatriz {
    public static void main(String[] args) {
        String[][] agenda = {{"Nome","Telefone"},
                             {"Ana", "526666"},
                             {"Paula","527789"},
                             {"Fabio","617788"},
                             {"Gabriel","688277"}
                            };
   // System.out.println(agenda[0][0]); - vai imprimir só a 1° coluna = NOME
     for (int l=0; l<= 4; l++){
        for (int c = 0; c <= 1; c++){
            System.out.println(agenda[l][c]);  

        }
     }
    }
}
