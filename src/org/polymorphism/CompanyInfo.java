package org.polymorphism;

public class CompanyInfo {
private void companyName() {
System.out.println("Company Name");
System.out.println("---------");
}
private void companyName(int id) {
System.out.println("Company ID :"+ id);
}
private void companyName(String name) {
	
	System.out.println("Company Address:"+ name);
		
}
private void companyName(float income,long phoneNo ) {
	System.out.println("Company Net Income:"+ income);
	System.out.println("Company PhoneNumber:"+ phoneNo);
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyName(12);
	c.companyName("19 Padi");
	c.companyName(9020000.2013f,9444796876l);
	
	
}


}