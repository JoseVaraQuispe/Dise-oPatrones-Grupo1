package Observador;

public class Company {
	public int ShareValue = 1;
	public void ChangeShare() {
		ShareValue+=1;
		ShareHolder ShareHolder1 = new ShareHolder();
		ShareHolder ShareHolder2 = new ShareHolder();
		ShareHolder ShareHolder3 = new ShareHolder();
		ShareHolder1.callAgent();
		ShareHolder2.callAgent();
		ShareHolder3.callAgent();
	}
}
