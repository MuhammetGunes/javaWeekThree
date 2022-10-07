package week3Homework.entities;

public class Program {
	private String name;
	private String category;
	private double unitPrice;
	public Program() {
		
	}
	public Program(String name, String category, double unitPrice) {
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
