import java.util.Scanner;

public class InvoiceNew{
	
	private String partNumber;
	private String partDescription;
	private int quantityPurchased;
	private double pricePerItem;

	public InvoiceNew(String partNumber, String partDescription, int quantityPurchased, double pricePerItem){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if (quantityPurchased > 0){
			this.quantityPurchased = quantityPurchased;
		}
		if (pricePerItem > 0.0){
			this.pricePerItem = pricePerItem;
		}
	}

	//Method for calculating the Invoice Amount
	public double getInvoiceAmount(){
		return quantityPurchased * pricePerItem;
	}
	
	//set methods
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	public void setPartDescription(String partDecription){
		this.partDescription = partDescription;
	}
	public void setQuantityPurchased(int quantityPurchased){
		this.quantityPurchased = quantityPurchased;
	}
	public void setPricePerItem(double pricePerItem){
		this.pricePerItem = pricePerItem;
	}

	//get methods
	public String getPartNumber(){
		return partNumber;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public int getQuantityPurchased(){
		return quantityPurchased;
	}
	public double getPricePerItem(){
		return pricePerItem;
	}
}