/**
     * @author MAAG
     *
     */
    public interface IPila<T> {

        int count();

        boolean isEmpty();

        void push(T value);

        T pull();

    }
