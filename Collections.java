package Arrays;
import java.util.Set;
import java.util.HashSet;


public class Collections {
	
		public static void main(String[] args) {
			
			int arr[]= {2,3,45,3,6,7,0,0,3,6};
			HashSet<Integer> set1=new HashSet<>();
			HashSet<Integer>set2=new HashSet<>();
			
			//set.add(20);
			//set.add(40);
			//set.add(30);
		//	set.add(15);
			
			for(int i:arr) {
				if(set1.contains(i)) {
					set2.add(i);
				}
				else {
					set1.add(i);
				}
			}
			
			System.out.println(set2);
			//System.out.println(set.remove(2));
			//System.out.println(set);
		//	System.out.println(set.contains(2));
			
			

		}


}
