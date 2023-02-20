package Comparable;

public class Laptop implements Comparable<Laptop>{
	
	private String Brand;
	private int ram;
	private int price;
		
	public Laptop(String brand, int ram, int price) {
		// TODO Auto-generated constructor stub
		
		this.Brand=brand;
		this.ram=ram;
		this.price=price;
	}



	@Override
	public String toString() {
		return "Laptop [Brand=" + Brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public int compareTo(Laptop lap2) {
		// TODO Auto-generated method stub
		
		if(this.getRam()>lap2.getRam())
		{
			return 1;
		}else {
			return -1;
		}
	
	}
	

}
