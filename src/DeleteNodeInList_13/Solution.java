package DeleteNodeInList_13;

import List.MyLinkList;
import List.Node;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by bupt on 5/4/17.
 */
public class Solution {
     public static void deleteNode(MyLinkList list,Node deleted){
         if(list.head == null || deleted == null)
             return;
         if(deleted.next != null){
             Node temp = deleted.next;
             deleted.data = temp.data;
             deleted.next = temp.next;
         } else if(list.head.equals(deleted)){
             list.head = null;
         } else {
             Node temp = list.head;
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

        MyLinkList list = new MyLinkList();

        list.addNode(node1);
        list.addNode(node2);
        list.addNode(node3);
        list.addNode(node4);
        list.addNode(node5);
        list.addNode(node6);

        list.print();
        deleteNode(list,node6);
        list.print();
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
