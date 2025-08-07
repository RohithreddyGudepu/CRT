package linkedList;

public class SingleLinkedList {
    Node head;
    static class Node{

        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next  = null;

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
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        if(head.next == null){
            head.next = newNode;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    public void deletelast(){
        Node LN = head.next;
        Node SN = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(LN.next != null){
            LN = LN.next;
            SN = SN.next;
        }
        SN.next =null;
    }
    public String Search(String key){
        Node current =head;
        if(head == null){
            System.out.println("No list to search");
        }
        while(current!=null){
            if(current.data == key){
                System.out.println("Element found");
                return key;
            }

            current = current.next;
        }
        return null;

    }
    public void Maxval(){

        Node current =head;
        int num=0 ;
        int max=0;
        while(current != null){
            try {
                num = Integer.parseInt(current.data);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(num>max){
                max = num;
            }
            current = current.next;
        }
        System.out.println("Max value is : "+max);
    }
    public void Minval(){

        Node current =head;
        int num=0 ;
        int min=100;
        while(current != null){
            try {
                num = Integer.parseInt(current.data);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(num<min){
                min = num;
            }
            current = current.next;
        }
        System.out.println("Min value is : "+min);
    }
    public void Reverse(){
        if(head == null || head.next == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node prevNode = null;
        Node nextNode
                ;
        nextNode = null;

        while(current !=null){
            nextNode = current.next;
            current.next= prevNode;
            prevNode = current;
            current = nextNode;

        }
        head = prevNode;
        System.out.println("Reversed list is: ");
        printlist();
    }
    public  void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");


    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst("10");
        list.addFirst("20");
        list.addFirst("30");
        list.addLast("22");

        list.printlist();
        list.Reverse();
        list.Search("22");
        list.deleteFirst();
//        list.printlist();
        list.deletelast();
//        list.printlist();
//        list.addFirst("30");
//        list.addLast("50");
//        list.printlist();
        list.Maxval();
       list.Minval();
//        list.printlist();




    }

}

