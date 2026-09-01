public class caminhao extends Veiculo{
    Boolean carga;

    public void desembarque(){
        System.out.println(modelo+": está fazendo a descarga");
    }

    public void printinfcarro(){
        System.out.println("--CAMINHÃO--");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
        System.out.println("Carga: "+carga);
        System.out.println("Consumo: "+consumo);
    }
}
