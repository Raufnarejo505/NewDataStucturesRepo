public class OddEvenLL {
    static Node oddHead;
    public static void main(String[] args) {
        DoubleLinkedList obj =new DoubleLinkedList();
        oddHead=OddEvenLL.makeOdd(obj.head);

    }
    public static Node makeOdd(Node head){
        Node cur=head;
        Node oddHead=null;
        while(cur.next!=null){
            if(cur.name%2==0){
                oddHead=cur;
                break;
            }
            cur=cur.next;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.name%2==0){
                oddHead.next=temp;
                temp.next=null;
            }
        }
        return oddHead;
    }
    public void printAll() {
        Node cur=makeOdd(oddHead);

        while(cur.next!=null){
            System.out.println(cur.name);
            cur=cur.next;
        }
        System.out.println(cur.name);
    }
}
