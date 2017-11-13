package shapes; 

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes 
 *
 */ 
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area = radius * radius * pi;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double peri = radius * 2 * pi;
		return peri;
	}

	@Override
	public String toString() 
	{
		String circle = "Circle of radius " + this.radius;
		return(circle);
	}
}
