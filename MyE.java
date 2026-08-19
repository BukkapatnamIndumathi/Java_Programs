package ExceptionHandling;

public class MyE {
    public static void main(String[] args){
        System.out.println(Dumble());
    }
    static int Dumble(){
        try {
            System.out.println("This is Try");
            return 10;
        }
        finally {
            System.out.println("This is finally");
        }
    }
}
