package Observador2;



public class Revista {
	private String Descripcion="";
	private String Autor="";
	private String Titulo="";
	
	
	public void publishNews(Observador observer) {
		this.Descripcion="Contenido noticia";
		this.Autor = "Autor";
		this.Titulo = "Nueva noticia";
		observer.notificarSuscriptores();
	}

}
