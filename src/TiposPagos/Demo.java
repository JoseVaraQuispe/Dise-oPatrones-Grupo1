package TiposPagos;

public class Demo {
	public void main(String[]args){
		
		Pagar pagar = new Pagar();
		TipoPago tipoPago = pagar.selectPago(1);
		ServerVisa dataVisa = ServerVisa.GetInstance();
		
	}
}
