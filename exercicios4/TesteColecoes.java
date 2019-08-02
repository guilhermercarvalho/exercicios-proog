/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios4;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author guilherme
 */
public class TesteColecoes {

    public static void main(String[] args) {
        LinkedList<String> msg = new LinkedList<String>();

        msg.add("Bia");
        msg.add("Ana");
        msg.add("Gil");
        
        Iterator<String> it = msg.iterator();
        
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}