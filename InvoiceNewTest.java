public class InvoiceNewTest{
	public static void main(String[] args){
		InvoiceNew buyer1 = new InvoiceNew("A327", "Kia Door Part", 2, 90.40);
		InvoiceNew buyer2 = new InvoiceNew("B238", "Toyota Brake Pad", 3, 101.32);
		InvoiceNew buyer3 = new InvoiceNew("C191", "Honda Steering Wheel", 2, 94.60);
		InvoiceNew buyer4 = new InvoiceNew("D737", "Hyundai Fan Belt", 12, 50.50);

	System.out.println("____________________________________________________________________________________________________________________________");
	System.out.println();
	System.out.println("| Part Number\t|\tPart Description\t\t|\tQuantity Purchased\t|\tPrice per item ||   Invoice Amount");
	System.out.println("____________________________________________________________________________________________________________________________");

	System.out.printf("   %s\t\t|\t%s\t\t\t|\t\t   %d\t\t|\t   %.2f\t|\t %.2f%n  ", buyer1.getPartNumber(), buyer1.getPartDescription(), buyer1.getQuantityPurchased(), buyer1.getPricePerItem(), buyer1.getInvoiceAmount());
	
	System.out.printf(" %s\t\t|\t%s\t\t|\t\t   %d\t\t|\t   %.2f\t|\t %.2f%n  ", buyer2.getPartNumber(), buyer2.getPartDescription(), buyer2.getQuantityPurchased(), buyer2.getPricePerItem(), buyer2.getInvoiceAmount());

	System.out.printf(" %s\t\t|\t%s\t\t|\t\t   %d\t\t|\t   %.2f\t|\t %.2f%n  ", buyer3.getPartNumber(), buyer3.getPartDescription(), buyer3.getQuantityPurchased(), buyer3.getPricePerItem(), buyer3.getInvoiceAmount());

	System.out.printf(" %s\t\t|\t%s\t\t|\t\t   %d\t\t|\t   %.2f\t|\t %.2f  ", buyer4.getPartNumber(), buyer4.getPartDescription(), buyer4.getQuantityPurchased(), buyer4.getPricePerItem(), buyer4.getInvoiceAmount());
	}
}