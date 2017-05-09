package MinInStack_21;

import java.util.Stack;

/**
 * Created by bupt on 5/8/17.
 */
public class MinInStack<E extends Comparable<E>> {
    private Stack<E> stack;
    private Stack<E> minStack;

    public MinInStack() {
        this.stack = new Stack<E>();
        this.minStack = new Stack<E>();
    }

    public void push(E value) {
        stack.push(value);

        if (minStack.isEmpty() || value.compareTo(minStack.peek()) < 0)
            minStack.push(value);
        else
            minStack.push(minStack.peek());


    }

    public E pop() {
        if (stack.isEmpty() && minStack.isEmpty())
            throw new RuntimeException("no data");
        E value = stack.pop();
        minStack.pop();
        return value;
    }

    public E getMin() {
        if (stack.isEmpty() && minStack.isEmpty())
            throw new RuntimeException("no data");
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinInStack<Data> test = new MinInStack<>();
        test.push(new Data(3));
        test.push(new Data(5));
        test.push(new Data(1));


        System.out.println(test.getMin().getData());
        test.pop();
        System.out.println(test.getMin().getData());

        MinInStack<Integer> test2 = new MinInStack<>();
        test2.push(3);
        test2.push(5);
        test2.push(1);


        System.out.println(test2.getMin());
        test2.pop();
        System.out.println(test2.getMin());
    }
}
