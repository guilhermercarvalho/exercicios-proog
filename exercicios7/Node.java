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
public class Node {
    private Object item;
    private Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(Object item) {
       this(item, null);
    }
    
    public Node(){
        this(null, null);
    }
    
    public Object getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
