package FactoryMethod;

public class Demo {
	public void main(String[]args){
		Store store = new Store();
		Computer computer = store.sale(1);
	}
}
