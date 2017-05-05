package StackQueue_07;

import java.util.Stack;

/**
 * Created by bupt on 5/3/17.
 */
public class StackQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void poll(int value){
        s1.push(value);
    }

    public int pop(){
        if(s2.isEmpty()){
            if(s1.isEmpty())
                return Integer.MIN_VALUE;
            while(!s1.isEmpty()){
                int temp = s1.pop();
                s1.push(temp);
            }
        }
        return  s2.pop();
    }
}
