package org.polymorphism;

public class GreensTech5 {
private void greensOmr() {
System.out.println("Greens Technology");
System.out.println("    ");
}
private void greensOmr(String branch) {
	System.out.println("Branch:"+ branch);
}
private void greensOmr(int no) {
	System.out.println("Branch Number:"+ no);
	
}

private void greensOmr(String address,long phoneNo) {
System.out.println("Branch Address:"+ address);
System.out.println("Branch PhoneNumber:"+ phoneNo);
	
}
private void greensOmr(float ratings,String comments) {
	System.out.println("Branch Ratings:"+ ratings);
	System.out.println("Brancg Comment:"+ comments);
}
public static void main(String[] args) {
	GreensTech5 g = new GreensTech5();
	g.greensOmr();
	g.greensOmr("OMR");
	g.greensOmr(12);
	g.greensOmr("19-OMR", 944775678l);
	g.greensOmr(4.5f," Nice");
}
}