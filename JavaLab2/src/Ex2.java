import java.text.*; //1. import library for format number
public class Ex2 {

	public static void main(String[] args) {
		//2. define object call DecimalFormat Class
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299;
		int numberofCustomer = 5;
		
		float totalprice = BUFFET * numberofCustomer;
		//3. apply frm object to totalprice
		System.out.println("Bufftet of "+numberofCustomer+""
				+ " customer is "+ frm.format(totalprice));
		float serviceCharge = totalprice + (totalprice * 3 / 100);
		System.out.println("Add Service Charge 3% is "
				+ frm.format(serviceCharge));
	}

}
