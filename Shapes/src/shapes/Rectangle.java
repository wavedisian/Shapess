package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape 
{

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		double area = this.length * this.width;
		return area;
	}


	public double calculatePerimeter() {
		double peri = 2 * ( this.width + this.length);
		return peri;
	}


	public String toString() {
		return "Rectangle Width: " + width + 
				" Length: " + length + 
				" Area: " + this.calculateArea() + 
				" Perimeter: " + this.calculatePerimeter();
	}
}