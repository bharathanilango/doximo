package org.inheritence;

//Child Class For CompanyDetails
//Hierarchical Inheritance
public class ClientDetails extends CompanyDetails{
	public void clientId() {
		System.out.println("Client Id Is 2001");
	}
	public void clientName() {
		System.out.println("client Name IS Infosys");
	}
	public static void main(String[] args) {
		ClientDetails cd = new ClientDetails();
		cd.comId();
		cd.comName();
		cd.clientId();
		cd.clientName();
	}
}
