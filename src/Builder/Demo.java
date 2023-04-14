package Builder;

public class Demo {
	public static void Main(String[] args) {
		System.out.println("Hola");
		
		Student student = new StudentBuilder().setCode("1234").setId(1).setName("Pedro").build();
		Book book = new BookBuilder().setTitulo("libro1").build();
	}
}
