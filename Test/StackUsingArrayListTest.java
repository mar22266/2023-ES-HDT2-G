import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingArrayListTest {

    static StackUsingArrayList stack = new StackUsingArrayList();


    /**
     * Prueba de contar
     */
    @Test
    void count() {

        stack.count();
        assertEquals(0, stack.count());


    }
/**
 * Prueba de vacio
 */

    @Test
    void isEmpty() {
        stack.isEmpty();
        assertEquals(true, stack.isEmpty());
    }

    /**
     * Prueba de push
     */
    @Test
    void push() {
        stack.push(1);
        assertEquals(1, stack.count());
    }
/**
 * Prueba de pull
 */

    @Test
    void pull() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pull();
        assertEquals(2, stack.count());
    }
}