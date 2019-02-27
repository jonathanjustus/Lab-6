import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("TestRectangle", 2, 1);
		Shape b = new EquilateralTriangle("TestETriangle", 4);
		Shape c = new Square("TestSquare", 8);
		Shape d = new Circle("TestCircle", 10);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
	
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), d);
		
	}
	

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("TestRectangle", 2, 1);
		Shape b = new EquilateralTriangle("TestETriangle", 4);
		Shape c = new Square("TestSquare", 8);
		Shape d = new Circle("TestCircle", 10);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		Comparator<Shape> comparator = null;
		sorter.sortShapes(comparator);
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("TestRectangle", 2, 1);
		Shape b = new EquilateralTriangle("TestETriangle", 4);
		Shape c = new Square("TestSquare", 8);
		Shape d = new Circle("TestCircle", 10);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
	
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape A = new Rectangle("TestRectangle", 2, 1);
		Shape B = new EquilateralTriangle("TestETriangle", 4);
		
		sorter.addShape(A);
		sorter.addShape(B);
		
		String output1 = String.format("%s:\t ID = %s\t area = %.3f\t perimeter = %.3f", A.getShapeType(), A.getId(), A.getArea(), A.getPerimeter());
		String output2 = String.format("%s:\t ID = %s\t area = %.3f\t perimeter = %.3f", B.getShapeType(), B.getId(), B.getArea(), B.getPerimeter());
		String output = output1 + output2;
		
		Assert.assertEquals("Incorrect toString.", output, sorter.toString());
	}
}
