package arraylist;

import java.util.ArrayList;

public class For {
	public static void main(String args[]) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(100);
		num.add(200);
		num.add(300);
		num.add(400);
		num.add(500);
		num.add(600);
		num.add(700);
		num.add(800);
		num.add(900);
		num.add(1000);
		
		// For
		int val = 0;
		
		for(int i = 0; i < num.size(); i++) {
			if(num.get(8) % 5 == 0) {
			 val = num.get(8);
			}
		}
				System.out.println(val);
			
		
	

}
}