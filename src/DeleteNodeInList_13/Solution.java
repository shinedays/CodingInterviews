package DeleteNodeInList_13;

import List.MyLinkedList;
import List.Node;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by bupt on 5/4/17.
 */
public class Solution {
     public static void deleteNode(Node deleted){
         if(MyLinkedList.head == null || deleted == null)
             return;
         if(deleted.next != null){
             Node temp = deleted.next;
             deleted.data = temp.data;
             deleted.next = temp.next;
         } else if(MyLinkedList.head.equals(deleted)){
             MyLinkedList.head = null;
         } else {
             Node temp = MyLinkedList.head;
             while(!temp.next.equals(deleted)){
                 temp = temp.next;
             }
             temp.next = null;
         }
     }

     public static Predicate<Integer> isEden(){
         return e->e%2==0;
     }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        MyLinkedList.addNode(node1);
        MyLinkedList.addNode(node2);
        MyLinkedList.addNode(node3);
        MyLinkedList.addNode(node4);
        MyLinkedList.addNode(node5);
        MyLinkedList.addNode(node6);

        MyLinkedList.print();
        deleteNode(node6);
        MyLinkedList.print();
        int a = 6;
        System.out.println(isEden().test(a));

        Function<Integer,Integer> add = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer a) {

                return null;
            }
        };


    }

}
