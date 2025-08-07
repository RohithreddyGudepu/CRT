package linkedList;

public class Repeat {
    Node head;
    class Node{
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node current =head;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        while(current.next != null){
            current = current.next;
        }
        current.next=newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        Node Ln =head.next;
        Node Sn =head.next;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while( Ln.next !=null){
            Ln = Ln.next;
            Sn = Sn.next;
        }
        Sn.next = null;
    }
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Repeat rp=new Repeat();
        rp.addFirst("10");
        rp.addLast("20");
        rp.addFirst("30");
        rp.addLast("40");
        rp.printlist();
        rp.deleteFirst();
        rp.printlist();
        rp.deleteLast();
        rp.printlist();



    }
}
