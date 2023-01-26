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
    public interface IStack<T> {

        int count();

        boolean isEmpty();

        void push(T value);

        T pull();

    }
