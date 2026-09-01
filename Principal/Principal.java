public class Principal {
    public static void main(String[] args) {
        carro v1 = new carro();
            v1.marca = "Uno";
            v1.ano = 2052;
            v1.cor = "Azul";
            v1.modelo = "Batata";
            v1.drift = true;
            v1.consumo = 23;
            v1.calculo(500, v1.consumo, 6);

        caminhao cm1 = new caminhao();
            cm1.modelo = "Modelo Teste";
            cm1.ano = 2005;
            cm1.marca = "Toyta";
            cm1.carga = true;
            cm1.consumo = 95;
            
        
        v1.printinfcarro();
        System.out.println(" ");
        cm1.printinfcarro();

        
    }
    
}
