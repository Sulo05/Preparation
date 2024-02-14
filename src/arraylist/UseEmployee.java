package arraylist;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String args[]) {
		Employee a = new Employee("Anitha",501,"Manager",50000,3,"Female");
		Employee b = new Employee("aradhya",502,"HR",40000,2,"Female");
		Employee c = new Employee("ARUN",503,"TL",35000,1,"Male");
		Employee d = new Employee("Mubashir",504,"Lead",20000,2,"Male");
		Employee e = new Employee("aarthy",505,"worker",10000,0,"Female");
		ArrayList<Employee>  emp = new ArrayList<>();
		emp.add(a);
		emp.add(b);
		emp.add(c);
		emp.add(d);
		emp.add(e);
		//for
//		for(int i = 0; i < emp.size(); i++) {
//			if(emp.get(i).getname().equals(emp.get(i).getname().toUpperCase())) {
//				System.out.println(emp.get(i));
//			}
//		}
//		//enhanced for
//		for(Employee s : emp) {
//			if(s.getsalary() > 25000) {c
//				System.out.println(s);
//				
//			}
//		}
//		//For Each
//			
//		emp.forEach(x -> {
//			if(x.getgender().equals("Male")) {
//				System.out.println(x);
//			}
//					
//		});
		// for array list
//		
//		for(int i = 0; i < emp.size(); i++) {
//			if(emp.get(i).getname().equals(emp.get(i).getname().toLowerCase())) {
//				System.out.println(emp.get(i));
//				
//				
//			}
//		}
		ArrayList<Employee> newemp = new ArrayList<>();
		for(int i = 0; i < emp.size(); i++) {
			if(emp.get(i).getexperience() > 2) {
			emp.get(i).setsalary(emp.get(i).getsalary()+(emp.get(i).getsalary() * 10 / 100));
				newemp.add(emp.get(i));
				System.out.println(newemp);
			}
		}
		
		for(Employee g : emp) {
			if(g.getrole().equals("HR")) {
				System.out.println(g);
				
			}
		}

    	
    
}
}
