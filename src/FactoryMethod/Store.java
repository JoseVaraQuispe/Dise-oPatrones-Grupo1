package FactoryMethod;

public class Store {
	public Computer sale(int type) {
		switch(type) {
		case 1:
			return new DellComputer();
		case 2:
			return new MacComputer();
		case 3:
			return new AsusComputer();
		}
		return null;
	}
	
	public Computer sale2(int type) {
		return new ComputerFactory().build(type);
	}

}
