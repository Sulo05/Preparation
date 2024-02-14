package arraylist;

import java.util.ArrayList;

public class Array {
	public static void main(String args[]) {
		ArrayList<Integer> num = new ArrayList<>();
		// add method
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
		// adding value in between
		num.add(4,10);
		// replacing the value;
		num.set(8, 80);
		// to get the particular value in the array use (variablename.get(index)) in sysout
		//System.out.println(num.get(2));
		num.get(2);
		//removes the particular value
		num.remove(6);
		// to get the length of the array use size()
		System.out.println(num.size());
	}

}
