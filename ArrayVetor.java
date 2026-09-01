public class ArrayVetor {
    public static void main(String[] args) {
        String[] nomesBandas= {"Linkin Park", "Pitty","System of a Down","Natiruts"};
        //System.out.println("Banda: "+ nomesBandas[0]);  //pode ser usada este cod (executa só uma vez) 
        //ou o laço de repetição FOR (mostra todas as variaveis)
        for(int i=0; i<nomesBandas.length ; i++){
            System.out.println("Banda:"+ nomesBandas[i]);
        }

    }
}
