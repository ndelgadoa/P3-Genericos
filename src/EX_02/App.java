package EX_02;

import EX_01.Stack;

public class App {
    public static void main(String[] args) {
        StackArray stack = new StackArray();

        stack.isEmpty();
        stack.add(5);
        stack.add(5);
        stack.isEmpty();
        stack.toString();
        stack.removeFirst();
        stack.getFirst();


    }
}
