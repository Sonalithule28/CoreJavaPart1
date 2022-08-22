package com.design.pattern;
class Database{
	private static Database dbObject;//singleton object
	private Database() {
	}
		public static Database getInstance() {
			
			if(dbObject == null) {//create object if its not already created
				dbObject= new Database();
				}
		return dbObject;//return the singleton object.
		

}
public void getConnection() {
	System.out.println("You are now connected to database....");
}
}


public class SingletonDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db1;
		db1=Database.getInstance(); //refer to the only object of Database
		db1.getConnection();

	}

}
