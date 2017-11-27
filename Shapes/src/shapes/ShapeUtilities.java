package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Rhombus(rand.nextInt(50), rand.nextInt(60));
		case 4:
			return new Triangle(rand.nextInt(50), rand.nextInt(70), rand.nextInt(60));
		default:
			return new Circle(rand.nextInt(100));
		}

	}
	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) {
		double sumarea = 0;
		for(int p = 0; p < shapes.length; p
				++)
		{
			sumarea = sumarea + shapes[p].calculateArea();
		}
		return sumarea;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) {
		double sumperi = 0;
		for (int i = 0; i < shapes.length; i++) 
		{
			 sumperi = sumperi + shapes[i].calculatePerimeter();
		}
		return sumperi;
	}
	public static void countShapes(Shape[] shapes)
	{
		int rectangles = 0;
		int circles = 0;
		for (Shape x : shapes)
		{
			if (x instanceof Circle)
			{
				circles ++;
			}
			if (x instanceof Rectangle)
			{
				rectangles ++;
			}
			System.out.println(circles + " Circles Found and " + rectangles + "rectangles.");
		}
				
	}

}
