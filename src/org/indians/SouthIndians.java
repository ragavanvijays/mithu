package org.indians;

public class SouthIndians extends Indians {
	void breakfast() {
		System.out.println("idly&dosa");
	}
	private void dressing() {
		System.out.println("vesti&sarry");
	}
	public static void main(String[] args) {
	SouthIndians s =new SouthIndians();	
	s.breakfast();
	s.dressing();
	s.adharCard();
	s.cash();
	s.panCard();
	}

}
