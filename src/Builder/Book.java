package Builder;
import java.time.LocalDate;

public class Book {
	private String titulo;
	private String isbn;
	private String autor;
	private LocalDate fechaPublicacion;
	private String numeroPaginas;
	public Book() {}

	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion=fechaPublicacion;
	}
	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas=numeroPaginas;
	}
}
