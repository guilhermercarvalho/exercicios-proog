public class Exemplo4
{
public String nome;
public int num;
public Exemplo4(String nome, int num){
        this.nome = nome;
        this.num = num;
}
public static void main (String [] args){
        Exemplo4 novoExemplo = new Exemplo4("Beltrano", 1),
                 novoExemplo2 = new Exemplo4("Beltrano", 1);
        boolean isEqual = (novoExemplo == novoExemplo2);
        if(isEqual)
                System.out.println("Iguais");
        else
                System.out.println("Diferentes");
}
}
