package ExceptionHandling;

public class MyExce {

    public static void main(String[] args) {
        int age = 10;

        try {
            isEligible(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isEligible(int age) throws Exception {

        if (age >= 18) {
            System.out.println("Eligible");
            return true;
        } else {
            throw new Exception("You are not eligible");
        }
    }
}