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
	 */
	@Override
	public int count() {
		return miListaInterna.size();
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return miListaInterna.isEmpty();
	}

	
	/** 
	 * @param value
	 */
	@Override
	public void push(T value) {
		miListaInterna.add(0, value);
	}

	
	/** 
	 * @return T
	 */
	@Override
	public T pull() {
		return miListaInterna.remove(0);
	}

}
