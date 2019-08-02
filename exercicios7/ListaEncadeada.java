package exercicios7;

import java.util.Random;

/**
 *
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 */
public class ListaEncadeada implements Lista {

    private Node head;

    public ListaEncadeada(Object item) {
        this.head = new Node(item);
    }

    public ListaEncadeada() {
        this.head = null;
    }

    @Override
    public Object get(int pos) {
        if (isEmpty()) {
            return null;
        }

        if (pos < 0 || pos > size() - 1) {
            return null;
        }

        Node aux = head;
        int cont = 0;
        while (cont < pos) {
            aux = aux.getNext();
            cont++;
        }

        return aux.getItem();
    }

    @Override
    public boolean add(int pos, Object item) {
        if (pos < 0 || pos > size()) {
            return false;
        }

        if (pos == 0) {
            return add(item);
        }

        Node novoNo = new Node(item), aux = head;
        int cont = 0;
        while (cont < pos - 1) {
            aux = aux.getNext();
            cont++;
        }

        novoNo.setNext(aux.getNext());
        aux.setNext(novoNo);
        return true;
    }

    @Override
    public boolean add(Object item) {
        Node novoNo = new Node(item, head);
        head = novoNo;
        return true;
    }

    @Override
    public boolean remove(int pos) {
        if (isEmpty()) {
            return false;
        }

        if (pos < 0 || pos > size() - 1) {
            return false;
        }

        Node aux = head;
        if (pos == 0) {
            head = head.getNext();
            return true;
        }

        int cont = 0;
        while (cont < pos - 1) {
            aux = aux.getNext();
            cont++;
        }

        aux.setNext(aux.getNext().getNext());
        return true;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int tamanho = 0;

        if (isEmpty()) {
            return tamanho;
        }

        Node aux = head;
        while (aux != null) {
            aux = aux.getNext();
            tamanho++;
        }

        return tamanho;
    }
    
    public boolean addEnd(Object item){
        if(isEmpty())
            return add(item);
        
        Random coringa = new Random();
        int cont = coringa.nextInt(2);
        System.out.println("CORINGA = " + cont);
        
        if(cont == 0)
            return add(size(), item);
        
        Node novoNo = new Node(item), aux = head;
        
        while(aux.getNext() != null)
            aux = aux.getNext();
        
        aux.setNext(novoNo);
        return true;
    }
    
    public Object retornaCentral(){
        int centro = size() / 2;
        
        return get(centro);
    }
    
    public boolean trocarElementos (int pos1, int pos2){
        if(isEmpty())
            return false;
        
        if(pos1 == pos2 || pos1 < 0 || pos2 < 0 || pos1 >= size() || pos2 >= size())
            return false;
        
        if(pos1 > pos2){
            int aux = pos1;
            pos1 = pos2;
            pos2 = aux;
        }
        
        Node aux1 = head, aux2;
        int cont = 0;
        while (cont < pos1) {
            aux1 = aux1.getNext();
            cont++;
        }

        aux2 = aux1;
        cont = pos1;
        while (cont < pos2) {
            aux2 = aux2.getNext();
            cont++;
        }

        remove(pos1);
        add(pos1, aux2.getItem());

        aux2.setItem(aux1.getItem());
        return true;
    }
    
    public boolean inverteLista(){
        if(isEmpty()){
            return false;
        }
        
        ListaEncadeada listaInvertida = new ListaEncadeada();
        
        Node aux = head;
        
        while(aux != null){
            listaInvertida.add(aux.getItem());
            aux = aux.getNext();
        }
        
        head = listaInvertida.head;
        return true;
    }
    
    public void imprimeLista(){
        if(isEmpty())
            System.out.println("Lista Vazia!");
        
        Node aux = head;
        
        while(aux != null){
            System.out.print(aux.getItem() + " ");
            aux = aux.getNext();
        }
        System.out.println();
    }

}
