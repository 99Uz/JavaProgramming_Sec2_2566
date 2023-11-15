
public class Ex1 {

	public static void main(String[] args) {
		String bookIsbn = "IB2-6325-85-4-1";
		String bookTitle = "Basic Java Programming";
		int bookUnit = 5;
		//float bookPrice = 225.75f;
		double bookPrice = 225.75;
		
		//display to console
		System.out.println("Book ISBN  : "+bookIsbn);
		System.out.println("Book Title : "+bookTitle);
		System.out.println("Book Unit  : "+bookUnit+" Book.");
		System.out.println("Book Price : "+bookPrice+" Baht.");
		System.out.println("--------------------------------");
		
		//Calculate totalprice and vat
		double totalPrice = bookUnit * bookPrice;
		System.out.println("Total Price is "+totalPrice);
		double vat = totalPrice + (totalPrice * 7 / 100);
		System.out.println("Add VAT 7%  is "+vat);
	}

}
