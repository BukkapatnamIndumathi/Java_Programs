package LinkedList;

public class LinkedList42 {
    private Node head;
    private Node tail;
    int size;

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;

    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void display(){
        Node temp=head;

        for(int i=0;i<size;i++){
            System.out.println(temp.value);
            temp=temp.next;
        }

        System.out.println("  ");
    }

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
