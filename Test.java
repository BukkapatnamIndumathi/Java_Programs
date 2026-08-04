package Encapsulations;

class Dummy extends Encaps{
	public void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class Test {

	public static void main(String[] args) {
		Dummy d=new Dummy();
		d.display();

	}

}
