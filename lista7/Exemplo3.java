public class Exemplo3
{
public String nome;
public static int num = 0;
public Exemplo3(String nome){
        this.nome = nome;
        ++num;
}
public static void main (String [] args){
        Exemplo3 novoExemplo = new Exemplo3("Beltrano"),
                 novoExemplo2 = new Exemplo3("Ciclano");
        System.out.println(novoExemplo.nome + " - " + novoExemplo.num);
        System.out.println(novoExemplo2.nome + " - " + novoExemplo2.num);
}
}
