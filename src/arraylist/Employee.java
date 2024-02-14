package arraylist;

public class Employee {
	String name;
	int id;
	String role;
	int salary;
	int experience;
	String gender;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getid() {
		return id;
	}
	public void setrole(String role) {
		this.role = role;
	}
	public String getrole() {
		return role;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public int getsalary() {
		return salary;
	}
	public void setexperience(int experience) {
		this.experience = experience;
	}
	public int getexperience() {
		return experience;
	}
    public void setgender(String gender) {
    	this.gender = gender;
    }
	public String getgender() {
		return gender;
	}
	public Employee(String name, int id, String role, int salary, int experience, String gender) {
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
		this.experience = experience;
		this.gender = gender;
	}
	public String toString() {
		return name+" "+id+" "+" "+role+" "+salary+" "+experience+" "+gender;
	}
	

}
