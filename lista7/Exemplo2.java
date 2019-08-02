public class Exemplo2
{
public String nome;
public int id;
public Exemplo2(){
        nome = "Fulano";
        id = 1;
}
public Exemplo2(String nome){
        this.nome = nome;
        id = -1;
}
public Exemplo2(String nome, int id){
        this.nome = nome;
        this.id = id;
}
public static void main (String [] args){
        Exemplo2 novoExemplo = new Exemplo2(),
                 novoExemplo2 = new Exemplo2("Beltrano"),
                 novoExemplo3 = new Exemplo2("Ciclano", 3);
        System.out.println(novoExemplo.nome + " - " + novoExemplo.id);
        System.out.println(novoExemplo2.nome + " - " + novoExemplo2.id);
        System.out.println(novoExemplo3.nome + " - " + novoExemplo3.id);
}
}
