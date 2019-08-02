package exercicios4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilherme
 */
public class TesteRecursivo {
    int cont;
    
    public void comerPizza(int pedacos){
        for(; pedacos > 8; pedacos--){
            System.out.println("Restam " + (pedacos-1) + " pedaços.");
        }
    }
    
    public void comerRecursivo(int pedacos){
        cont++;
        if(pedacos == 0){ // fim da recursão/caso base = quando chega no último caso.
            System.out.println("Acabou!!!");
            System.out.println(cont);
        }
        else{
            pedacos--;
            System.out.println("Restam " + pedacos + " pedaços.");
            System.out.println(cont);
            comerRecursivo(pedacos); // passa instância com valor menor que o recebido como parâmetro.
        }
    }
    
    public int multiplicar(int a, int b){
        if( b == 0){
            System.out.println("Fim da multiplicação!");
            return 0;
        }
        else{
            System.out.println(a + "\n" + b + "\n === \n");
            return a + multiplicar(a, --b);
        }
    }
    
    public int fatorial(int n){
        if(n == 1)
            return 1;
        return n * fatorial(n-1);
    }
    
    public static void inverte(int vet[], int esq, int dir){
        int temp;
        if(esq < dir){            
            temp = vet[dir];
            vet[dir] = vet[esq];
            vet[esq] = temp;
            inverte(vet, esq + 1, dir - 1);
        }
        else{
            for(int i = 0; i < vet.length; i++){
              System.out.print(vet[i] + " ");
          }
        }
        
    }
    
    public static void main(String[] args) {
        TesteRecursivo num = new TesteRecursivo();
        
//        System.out.println(num.multiplicar(3, 2));
//        System.out.println(num.fatorial(5));
//          int vet[] = {1,2,3,4};
//           
//          num.inverte(vet,0, vet.length - 1);
          num.comerRecursivo(8);
          
    }
}
