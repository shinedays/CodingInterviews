package List;

/**
 * Created by bupt on 5/4/17.
 */
public class MyLinkList {
    public  Node head = null;

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(int value) {
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

    public void addNode(Node node){
        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    public void print(){
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

    public void printNode(Node node){
        System.out.println(node.data);
    }
}
