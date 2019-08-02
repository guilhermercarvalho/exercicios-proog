public class Exemplo01
{
public int [] valores;
public Exemplo01(int [] valor){
        this.valores = valor;
        for(int i = 0; i < valor.length; i++)
                System.out.print(valor[i]+ " ");
        System.out.println("");
}
public void fazAlgumaCoisa(){
        for(int i = 1; i < valores.length; i++)
                valores[i] = valores[i - 1] + 2;
}
public static void main (String [] args)
{
        int [] vet = {3,4,5,6};
        Exemplo01 exemplo = new Exemplo01(vet);
        exemplo.fazAlgumaCoisa();
        for(int i = 0; i < vet.length; i++)
                System.out.println(vet[i]);
}
}
