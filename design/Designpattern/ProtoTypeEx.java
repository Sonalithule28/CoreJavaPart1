package com.design.pattern;

import java.util.ArrayList;
import java.util.List;

class User{
	String name,city;

	public User(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
@Override
	public String toString() {
		return "User [name=" + name + ", city=" + city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	}
class UserService{
	ArrayList al;
	public UserService() {
		al=new ArrayList<>();
		al.add(new User("Sonali", "PUNE") );
		al.add(new User("Janhavi", "PUNE") );
		al.add(new User("Samir", "THANE") );
	}
	public ArrayList getUser() {
		return al;
	}
}
 class UserDetails implements  Cloneable{
	private ArrayList alist;

	public UserDetails(ArrayList alist) {
		super();
		this.alist = alist;
	}

	public UserDetails() {
		super();
		this.alist=new ArrayList<>();
	}
	public void getUser() {
		UserService us=new UserService();
		this.alist=us.getUser();
	}
	public ArrayList<User> getUserList() {
		return alist;
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<User> temp = new ArrayList<User>();
        for(User s : this.getUserList()){
            temp.add(s);
        }
        return new UserDetails((ArrayList) temp);

		
	}
}
	
	


public class ProtoTypeEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		UserDetails us=new UserDetails();
		us.getUser();
		UserDetails us1;
		us1=(UserDetails)us.clone();
		List list1 = us1.getUserList();
        list1.remove(2);

        System.out.println("users List: " + us.getUserList());
       // System.out.println("usersNew List: " + list1);
        System.out.println("usersNew1 List: " + list1);

		
	}

}


