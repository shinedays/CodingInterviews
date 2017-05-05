package List;

/**
 * Created by bupt on 5/4/17.
 */
public class MyLinkedList {
    public static Node head = null;

    public static void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void addNode(Node node){
        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    public static void print(){
        if(head == null)
            System.out.println("no point");
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println();
    }

    public static void printNode(Node node){
        System.out.println(node.data);
    }
}
