package Array;

public class ArrayClass<Elem> implements Array<Elem> {

    private Elem[] array;
    private int counter;
    private int current;

    @SuppressWarnings("unchecked")
    public ArrayClass(){
        array = (Elem[]) new Object[DEFAULT_SIZE];
        current = -1;
        counter = 0;

    }
    @SuppressWarnings("unchecked")
    private void resize(){
        Elem[] temp = (Elem[]) new Object[array.length * GROWTH_RATE];

        System.arraycopy(array,0,temp,0,counter);

        array = temp;
    }

    @Override
    public boolean hasNext() {
        return current < counter;
    }

    @Override
    public Elem next() {
        return array[current++];
    }

    @Override
    public void add(Elem object) {
        if(counter == array.length)
            resize();
        array[counter++] =  object;
    }

    @Override
    public void initialize() {
        current = 0;
    }

    @Override
    public Elem[] getArray() {
        return array;
    }

    @Override
    public Elem remove(){
        Elem elem = array[0];
        System.arraycopy(array,1,array,0,counter--);
        return elem;
    }


}
