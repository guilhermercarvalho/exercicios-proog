/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios4;

public class TesteRecursivoCasa {

    public int fatorialIterativo(int n) {
        int fat = 1;
        for (; n >= 1; n--) {
            fat *= n;
        }
        return fat;
    }

    public int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    public int multIterativo(int a, int b) {
        int mult = 0;
        for (int i = 0; i < b; i++) {
            mult += a;
        }
        return mult;
    }

    public int multRecursivo(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multRecursivo(a, --b);
    }

    public void comerPizza(int pedacos) {
        if (pedacos == 0) {
            System.out.println("Acabou a pizza!");
        } else {
            System.out.println("Restam " + pedacos + " pedaços!");
            pedacos--;
            comerPizza(pedacos);
        }
    }

    public static void inverteVetor(int v[], int esq, int dir) {
        int temp;
        if (esq < dir) {
            temp = v[dir];
            v[dir] = v[esq];
            v[esq] = temp;
            inverteVetor(v, ++esq, --dir);
        } else {
            for (int vet : v) {
                System.out.print(vet + " ");
            }
            System.out.println("");
        }
    }

    public int pot(int b, int p) {
        if (p == 0)
            return 1;
        return b * pot(b, --p);
    }

    public static void main(String[] args) {
        TesteRecursivoCasa tst = new TesteRecursivoCasa();
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Fatorial
        System.out.println(tst.fatorialIterativo(5));
        System.out.println(tst.fatorialRecursivo(5));
        
        // Multiplicação
        System.out.println(tst.multIterativo(3, 8));
        System.out.println(tst.multRecursivo(3, 8));
        
        // Comer Pizza
        tst.comerPizza(8);
        
        
        // Inverter vetor
        for (int vet : v) {
            System.out.print(vet + " ");
        }
        System.out.println("");
        TesteRecursivoCasa.inverteVetor(v, 0, v.length - 1);
        
        // Potência de um número
        System.out.println(tst.pot(5, 2));
    }
}
