/**
 * 
 */
package exercicios7;

/**
 * @author guilherme
 *
 */
public interface Lista {
	
	//retornar valor armazenado na posicao da lista.
	Object get(int pos);

	//adiciona um valor na posicao da lista.
	boolean add(int pos, Object item);
	
	//adicona um valor na PRIMEIRA posicao da lista.
	boolean add(Object item);

	//remove o no na posicao da lista.
	boolean remove(int pos);

	//retorna TRUE para lista vazia.
	boolean isEmpty();
	
	//retorna tamanho da lista.
	int size();
}
