package Observador2;

import java.util.ArrayList;
import java.util.List;

public class Observador {
	public List<Usuario> suscriptores;
	public Observador() {
		this.suscriptores = new ArrayList<Usuario>();
	}
	public void suscribir(Usuario suscriptor) {
		suscriptores.add(suscriptor);
	}
	public void notificarSuscriptores() {
		for (Usuario suscriptor: suscriptores) {
			suscriptor.notificationNews();
		}
	}

}
