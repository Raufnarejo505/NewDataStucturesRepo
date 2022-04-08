public class SLL {
    Node head;
    public static void main(String[] args) {
        SLL obj  = new SLL();
        obj.insertSLL(new Node(1));
        obj.insertSLL(new Node(2));
        obj.insertSLL(new Node(3));
        obj.insertSLL(new Node(4));
        obj.print(obj.head);
        System.out.println("////////////////////////");
//        obj.reverse(obj.head);
        obj.print(obj.reverse(obj.head));
        System.out.println("////////////////////////");
        obj.print(obj.head);


    }
    public void insertSLL(Node node){
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }

    public void print(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
     public Node reverse(Node cur){
        Node temp=null;
         Node head=cur;
         Node nextHead= head.next;
        while(head.next!=null){

            head.next=temp;
            temp=head;
            head=nextHead;
            nextHead=head.next;
        }
        if(head!=null){
            head.next=temp;
            temp=head;
            head=nextHead;
        }
        return temp;
     }

}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}