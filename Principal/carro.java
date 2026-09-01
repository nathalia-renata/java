public class carro extends Veiculo {
    Boolean drift;  

    public void printinfcarro(){
        System.out.println("--CARRO--");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
        System.out.println("Drift: "+drift);
        System.out.println("Consumo: "+consumo);
        }

    public void calculo(float km, float consumo, float precoGas){
        this.consumo = consumo;
        float valorTotal = (km/consumo)*precoGas;
        System.out.println("O gasto da viagem é: R$ "+valorTotal);
    }

    
}
