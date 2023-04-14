package TiposPagos;

public class TipoPagoFactory {
	public TipoPago build(int type) {

		switch(type) {
		case 1:
			return new VisaTP();
		case 2:
			return new EfectivoTP();
		case 3:
			return new YapeTP();
		}
		return null;
	}

}
