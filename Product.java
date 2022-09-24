package jdbc_maven;

public class Product {
	private int productId;
	private String productNumber;
	private double price;
	private String manufacturer;
	private String discount;
	private String warranty;
	private String manufacturingDate;
	private String GST;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getGST() {
		return GST;
	}
	public void setGST(String gST) {
		GST = gST;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productNumber=" + productNumber + ", price=" + price
				+ ", manufacturer=" + manufacturer + ", discount=" + discount + ", warranty=" + warranty
				+ ", manufacturingDate=" + manufacturingDate + ", GST=" + GST + "]";
	}

}
