package arraylist;

import java.util.ArrayList;

public class EnhancesFor {
	public static void main(String args[]) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(100);
		num.add(200);
		num.add(300);
		num.add(400);
		num.add(555);
		num.add(600);
		num.add(700);
		num.add(800);
		num.add(900);
		num.add(1000);
		
		for(int a : num) {
			if(a % 2 != 0) {
				System.out.println(a);
			}
		}
	

}
}
