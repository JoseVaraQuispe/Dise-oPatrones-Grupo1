package Builder;
import java.io.*;

public class Demo {
	public static void Main(String[] args) {
		System.out.println("Hola");
		
		Student student = new StudentBuilder().setCode("1234").setId(1).setName("Pedro").build();
	}
}
