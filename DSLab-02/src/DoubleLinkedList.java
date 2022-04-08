import java.util.ArrayList;

class Node {
    int name;
    Node prev, next;

    Node(int name) {
        this.prev = null;
        this.next = null;
        this.name = name;
    }
}

public class DoubleLinkedList {

    Node head;
    Node tail;

    // Add node with name in beginning of linkedlist, name as param
    public void insertAtBeginning(int name) {
        Node newNode=new Node(name);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;

            head.prev=newNode;
            head=newNode;
        }
    }

    // Add node in beginning of linedlist, node as param
    public void insertAtBeginning(Node node) {
        if(head==null){
            head=tail=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }

    // Add node in end of linedlist, name as param
    public void insertAtEnd(int name) {
        Node newNode= new Node(name);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }

    // Add node in end of linedlist, node as param
    public void insertAtEnd(Node node) {
        if(head==null){
            head=tail=node;
        }else{
           tail.next=node;
           node.prev=tail;
           tail=node;
        }
    }

    // Add node after name which is provided as param , name and node as params
    public void insertAfterName(int name, Node node) {
        Node cur=head;
        while(cur.next!=null){
            if(cur.name==name){
                node.prev=cur;
                node.next=cur.next;
                cur.next.prev=node;
                cur.next=node;
            }
            cur=cur.next;
            }
         if(cur.name==name){
             node.prev= tail;
             tail.next=node;
             tail=node;
         }
        }

    // Add node before name which is provided as param , name and node as params
    public void insertBeforeName(int name, Node node) {
        Node cur=head;
        while(cur.next!=null){
            if(cur.name==name){
                node.next=cur;
                node.prev=cur.prev;
                cur.prev.next=node;
                cur.prev=node;
            }
            cur=cur.next;
        }
        if(cur.name==name){
            node.next= tail;
            node.prev=tail.prev;
            tail.prev.next=node;
            tail.prev=node;
        }
    }

    // Make double linkedlist as Circular Double LinkedList
    public void makeCircular() {
        tail.next=head;
        head.prev=tail;
    }

    // Print all the nodes in linkedlist, make sure it works on circular double linkedlist
    public void printAll() {
            Node cur=head;

            while(cur.next!=tail){
                System.out.println(cur.name);
                cur=cur.next;
            }
            System.out.println(cur.name);
    }
    public void printReverseSLL(){
        Node cur = head;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        while(cur!=null){
            arrList.add(cur.name);
            cur=cur.next;
        }
        for(int i=arrList.size()-1;i>=0;i--){
            System.out.println(arrList.get(i));
        }
    }




    // Test the class
    public static void main(String[] args) {
        // Test all above methods
        DoubleLinkedList dLL = new DoubleLinkedList();
        dLL.insertAtBeginning(1);
        dLL.insertAtBeginning(2);
        dLL.insertAtBeginning(3);
        dLL.insertAtBeginning(4);
        dLL.printReverseSLL();
//        dLL.printAll();
    }

}
