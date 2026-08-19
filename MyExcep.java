package ExceptionHandling;

public class MyExcep {

    public static void main(String[] args){
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.print("Please don't provide 0 for variable ");
        }
        finally {
            System.out.println("Hey bittu");
        }
    }
}
