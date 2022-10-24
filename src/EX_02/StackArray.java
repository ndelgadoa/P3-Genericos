package EX_02;
import java.util.Arrays;
import java.util.ArrayList;

public class StackArray<T> {
    private T array[];
    int contador = 0;


    public StackArray() {
        array = (T[]) new Object[3];

    }
    public void isEmpty() {
        if (array[0] == null) {
            System.out.println("esta vacia");
        } else {
            System.out.println("esta llena");
        }
    }

    public void getFirst() {
        System.out.println(array[0]);
    }
    public T add(T dato) {
        if (contador == array.length) {
            T[] array2 = (T[]) new Object[array.length + 10];
            for (int i = 0; i <array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }else {
            for (int j = array.length -1; j> 0; j--) {
                array[j] = array[j - 1];
            }
        }
        contador++;
        array[0] = dato;
        return dato;
    }

    public String toString() {
        System.out.println(Arrays.toString(array));
        return null;
    }

    public void removeFirst() {

        for (int i = 0; i< contador; i++) {
            this.array[i] = this.array[i+ 1 ];
        }

    }


}
