package Singleton;

public class Database {
	private static Database database;
	
	private Database() {
		
	}
	
	public static Database GetInstance() {
		if(database == null) {
			return new Database();
		}
		else
		{
			return database;
		}
	}
}
