
public abstract class Shape {
	
	private String color;
	
	Shape(String color){
		this.color = color;
	}
	
	Shape(){
		this.color = null; //this.color = "";
	}
	
	public String toString() {
		return "Color= " + this.color;
	}
	
	//abstract method
	public abstract double getArea();
}
