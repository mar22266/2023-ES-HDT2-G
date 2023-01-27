/**
 * 
 */
import java.util.ArrayList;

/**
 * @author MAAG
 *
 */
/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public class StackUsingArrayList<T> implements IStack<T> {

	private ArrayList<T> miListaInterna;
	
	public StackUsingArrayList() {
		miListaInterna = new ArrayList<T>(); 
	}
	
	
	/** 
	 * @return int
	 * retorna el tamaño de la lista
	 */
	@Override
	public int count() {
		return miListaInterna.size();
	}

	
	/** 
	 * @return boolean
	 * verifica si la lista esta vacia
	 */
	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}

	
	/** 
	 * @param value
	 * agrega un valor a la lista
	 */
	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}

	
	/** 
	 * @return T
	 * retorna el valor de la lista
	 */
	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}

}
