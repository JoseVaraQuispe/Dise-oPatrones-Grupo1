package Observador2;


public class Demos {
	public static void main(String[] args) {
		Revista revista = new Revista();
		Observador observer = new Observador();
		Usuario Usuario1 = new Usuario();
		Usuario Usuario2 = new Usuario();
		Usuario Usuario3 = new Usuario();
		observer.suscribir(Usuario1);
		observer.suscribir(Usuario2);
		observer.suscribir(Usuario3);
		
		revista.publishNews(observer);
	} 

}
