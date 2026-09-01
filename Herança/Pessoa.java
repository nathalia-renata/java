public class Pessoa {
    String nome;
    String nacionalidade;
    int idade;
    float altura;
    String cor;
    float peso = 0;

    public void comer(){
        System.out.println(nome + " Fez Nhack");
        peso += 0.5;  
    }
    public void andar(){
        System.out.println(nome + " Está andando");
    }
    public void fazNiver(){
        idade += 1;  
    }
    public void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}