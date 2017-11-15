package shapes;

public class Rhombus extends Triangle
{
	private double side;
	private double angle;
	
	public Rhombus(double side, double angle)
	{
		super(side, side, angle);
		this.side = side;
		this.angle = Math.toRadians(angle);
	}
	public double calculatePerimeter()
	{
		double peri = 4*this.side;
		return peri;
	}
	public String toString()
	{
		return "Rhombus Side Length " + this.side +
				" Angle " + this.angle*180/3.14159265 +
				" Area: " + 2*calculateArea() +
				" Perimeter: " + calculatePerimeter();
	}
}
