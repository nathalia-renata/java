public class Principal {
    public static void main(String[] args) {
       Pessoa vicentina = new Pessoa();
       vicentina.nome = "Vicentina da Silva";
       vicentina.idade = 30;
       vicentina.peso = 50; 

       vicentina.info();

       vicentina.comer();
       vicentina.andar();
       vicentina.info();
    }
}
