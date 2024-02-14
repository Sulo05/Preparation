package arraylist;

import java.util.ArrayList;

public class ForEach {
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
		// to print the whole value
		num.forEach(x -> System.out.println(x));
		// inside the condition
		num.forEach(x -> {
			if(x % 2 == 0 && x % 3 == 0) {
				System.out.println(x);
			}
		});
	

}
}
