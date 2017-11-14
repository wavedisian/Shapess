package shapes;

public class Rhombus extends Triangle
{
	private double side;
	private double angle;
	
	public Rhombus(double side, double angle)
	{
		super(side, side, angle);
		this.side = side;
		this.angle = angle;
	}
	public double calculatePerimeter()
	{
		double peri = 4*this.side;
		return peri;
	}
	public String toString()
	{
		return "Rhombus Side Length " + this.side +
				"Angle " + this.angle +
				"Area: " + 2*calculateArea() +
				"Perimeter: " + calculatePerimeter();
	}
}
