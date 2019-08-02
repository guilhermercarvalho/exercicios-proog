public class Exemplo5
{
public String nome;
public int num;
public Exemplo5(String nome, int num){
        this.nome = nome;
        this.num = num;
}
public static void main (String [] args){
        Exemplo5 novoExemplo = new Exemplo5("Beltrano", 1),
                 novoExemplo2 = new Exemplo5("Beltrano", 1),
                 novoExemplo3;
        novoExemplo3 = novoExemplo2 = novoExemplo;
        if(novoExemplo3 == novoExemplo2)
                System.out.println("Exemplos 2 e 3 são iguais");
        else
                System.out.println("Exemplos 2 e 3 são diferentes");
        novoExemplo3 = new Exemplo5("Guilherme", 13);
        if(novoExemplo3 == novoExemplo2)
                System.out.println("Agora, exemplos 2 e 3 são iguais");
        else
                System.out.println("Agora, exemplos 2 e 3 são diferentes");
        System.out.println(novoExemplo3.nome + " - " + novoExemplo3.num);
}
}
