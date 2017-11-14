package shapes;

public class Triangle implements Shape
{
	private int side1;
	private int side2;
	private double angle; //in radians (i.e. the use of a double. The angle in question
						  //is the interior angle forms be the two defined sides.
	public Triangle(int side1, int side2, double angle)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
	}
	public double calculateArea()
	{
		double area = this.side1 * this.side2 * Math.sin(this.angle);
		return area;
	}
	public double calculatePerimeter()
	{
		double peri = this.side1 + this.side2 + Math.sqrt(
				this.side1*this.side1 + this.side2*this.side2 - 
				(2*this.side2*this.side1*Math.cos(this.angle))
				);
		return peri;
	}
}
