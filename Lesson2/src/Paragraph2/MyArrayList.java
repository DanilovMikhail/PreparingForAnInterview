package Paragraph2;

public class MyArrayList<T> {

    private int pointer;
    private int capacity;
    private Object[] array;

    public MyArrayList(){
        this.pointer = 0;
        this.capacity = 10;
        this.array = new Object[this.capacity];
    }

    public int size(){
        return pointer;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void display(){

//        for(int i = 0; i < pointer; i++){
//            System.out.println(array[i]);
//        }

        for (Object obj:array){
            System.out.println(obj);
        }
    }

    private void resize(int newCapacity){

        Object[] newArray = new Object[newCapacity];

        System.arraycopy(array, 0, newArray, 0, pointer);

        array = newArray;

    }

    public void add(T data){

        if (pointer == capacity){

            capacity = (capacity * 3) / 2 + 1;
            resize(capacity);

        }
        array[pointer++] = data;

    }

    public void remove(int index){

        int numMoved = pointer - index - 1;

        System.arraycopy(array, index + 1, array, index, numMoved);

        array[--pointer] = null;

        int newCapacity = 10;

        while (newCapacity < pointer){
            newCapacity = (newCapacity * 3) / 2 + 1;
        }
        resize(newCapacity);
    }

}
