package TiposPagos;

public class Pagar {

	public TipoPago selectPago(int type) {
		return new TipoPagoFactory().build(type);
	}
}
