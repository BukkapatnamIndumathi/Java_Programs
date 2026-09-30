package LinkedList;

import java.util.List;

public class MainClass {
   public static void main(String[] args) {
       LinkedList42 ll=new LinkedList42();
       ll.insertFirst(10);
       ll.insertFirst(20);
       ll.insertFirst(30);
       ll.insertLast(40);
       ll.insertLast(50);
       ll.display();
    }
}
