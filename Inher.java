package Encapsulations;

class parent{
	String name;
	int age;
	int marks;
}
class Child extends parent{
	
}
class Child1 extends Child{
	
}
class Child2 extends parent{
	
}
public class Inher {

	public static void main(String[] args) {
		Child c=new Child();
		Child c1=new Child1();
		//Child c2 =new Child2();
		c.name="Indu";
		c.age=21;
		c.marks=87;
		c1.name="Basket";
		c1.age=22;
		c1.marks=92;
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.marks);
		System.out.println(c1.name);
		//System.out.println(c2.name);
		
		

	}

}
