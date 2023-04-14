package Singleton;

public class Demo {
	public void main(String[]args){
		//new DataBase();
		Database database = Database.GetInstance();
	}
}
