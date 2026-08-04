package Basicsoops;

class Students {
    int rollNo;
    String name;
    int marks;

    // Parameterized Constructor
    Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Copy Constructor
    Students(Students s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.marks = s.marks;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }
}

public class BasicsOfOops {

    public static void main(String[] args) {

        // Creating first object using parameterized constructor
        Students st = new Students(42, "Indu", 87);

        // Creating second object using copy constructor
        Students st2 = new Students(st);

        //System.out.println("Original Object:");
        st.display();

       // System.out.println("\nCopied Object:");
        st2.display();
    }
}