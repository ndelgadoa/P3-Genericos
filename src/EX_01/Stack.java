package EX_01;
import java.util.LinkedList;
import java.util.AbstractCollection;



public class Stack<T> {

    LinkedList<T> mejor_profe = new LinkedList<T>();

    public Stack() {

    }

    public<T> void isEmpty() {
        if (mejor_profe.isEmpty()) {
            System.out.println("esta vacia");
        } else {
            System.out.println("esta llena");
        }
    }

    public T add(T francisco) {

        mejor_profe.add(francisco);

        return francisco;

    }

    public<T> void getFirst(){
        System.out.println("El primer elemento es: "
                + mejor_profe.getFirst());
    }

    public<T> void removeFirst(){
        System.out.println("The first element is: " + mejor_profe.removeFirst()+" ahora esta borrado");

    }

    public String toString() {
        System.out.println(mejor_profe.toString());


        return null;
    }

}

