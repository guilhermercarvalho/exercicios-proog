/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios7;

/**
 *
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 */
public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.imprimeLista();
        System.out.println(lista.size());
        System.out.println(lista.remove(0));
        System.out.println(lista.get(0));
        System.out.println(lista.isEmpty());
        
        for(int i = 0; i <= 15; i++){
            System.out.println(lista.add(i));
        }
        
        lista.imprimeLista();
        
        lista.inverteLista();
        
        lista.imprimeLista();
        
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.get(0));
        System.out.println(lista.get(16));
        System.out.println(lista.get(15));
        System.out.println(lista.add(16, 16));
        System.out.println(lista.retornaCentral());
        System.out.println(lista.addEnd(17));
        lista.imprimeLista();
        
        lista.trocarElementos(0, 1);
        lista.imprimeLista();
        lista.trocarElementos(0, 1);
        lista.trocarElementos(0, 17);
        lista.imprimeLista();
        lista.trocarElementos(0, 17);
        lista.trocarElementos(5, 6);
        lista.imprimeLista();
        lista.trocarElementos(5, 6);
        lista.trocarElementos(3, 9);
        lista.imprimeLista();
        lista.trocarElementos(3, 9);
        
        lista.remove(0);
        lista.remove(16);
        lista.remove(5);
        lista.imprimeLista();
    }
}
