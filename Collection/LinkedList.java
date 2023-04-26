package Collection;

public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void add(int data){
        Node new_node = new Node(data);
        if(head == null) head = new_node;
        else{
            Node last = head;
            while(last.next!=null) last=last.next;
            last.next=new_node;
        }
    }
    public static void printlist() {
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }System.out.println();
    }
    public static Node reverse(Node node) {
        Node prev=null;
        Node curr=node;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node=prev;
        return node;
    }
    public static void printlist(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();//-->this is not needed in this scenario but needs in some cases
        //one way of creating nodes
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        //another way
        add(10);
        add(20);
        printlist();
        printlist(reverse(head));
    }
}





