import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		Shape sqr = new Square("Square1", 3.0);
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		// TODO: complete this...
		Shape rectangle = new Rectangle("Rectangle1", 4.0, 5.0);
		Assert.assertEquals("Rectangle area incorrect.", 20.0, rectangle.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter incorrect.", 18.0, rectangle.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangle type incorrect.", "Rectangle", rectangle.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Rectangle1", rectangle.getId());
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		// TODO: complete this...
		Shape triangle = new EquilateralTriangle("Triangle1", 4.0);
		Assert.assertEquals("Triangle area incorrect", 6.928, triangle.getArea(), 0.001);
		Assert.assertEquals("Triangle perimeter incorrect.", 12.0, triangle.getPerimeter(), 0.001);
		Assert.assertEquals("Triangle type incorrect.", "EquilateralTriangle", triangle.getShapeType());
		Assert.assertEquals("Triangle ID incorrect.", "Triangle1", triangle.getId());
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		// TODO: complete this...
		Shape trapezoid = new Trapezoid("TestTrapezoid", 20.0, 15.0, 30.0, 55.0);
		Assert.assertEquals("Trapezoid area incorrect.", 510.0, trapezoid.getArea(), 0.001);
		Assert.assertEquals("Trapezoid perimeter incorrect.", 120.0, trapezoid.getPerimeter(), 0.001);
		Assert.assertEquals("Trapezoid type incorrect.", "Trapezoid", trapezoid.getShapeType());
		Assert.assertEquals("Trapezoid ID incorrect.", "TestTrapezoid", trapezoid.getId());
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.", 2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2), circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.", 2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2), circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		// TODO: complete this...
		Shape circle = new Circle("Circle1", 4.0);
		Assert.assertEquals("Circle area incorrect.", 50.24, circle.getArea(), 0.1);
		Assert.assertEquals("Circle perimeter incorrect.", 25.12, circle.getPerimeter(), 0.1);
		Assert.assertEquals("Circle type incorrect.", "Circle", circle.getShapeType());
		Assert.assertEquals("Circle ID incorrect.", "Circle1", circle.getId());
	}

	/**
	 * Tests for Shape's toString().
	 */
	@Test
	public void ShapeToStringTest()
	{
		// TODO: complete this...
		Shape rect = new Rectangle("TestRectangle", 4.0, 4.0);
		Assert.assertEquals("ShapeToString incorrect.",
		String.format("%s:\n ID = %s\n area = %.3f\n perimeter = %.3f", rect.getShapeType(), rect.getId(), rect.getArea(), rect.getPerimeter()),rect.toString());
	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		// TODO: complete this...
		
		//Test if equal:
		Shape rect = new Rectangle("R1", 5.0,5.0);
		Shape sqr = new Square("S1", 5.0);
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 0, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 0, sc.compare(sqr2, rect2));
        Assert.assertTrue("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Shape rect3 = new Rectangle("R2", 3.0, 4.0);
        Shape sqr3 = new Square("S2", 5.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(sqr3, rect3));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(rect3, sqr3));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(sqr3, rect3));
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		// TODO: complete this...

	    // Test same area and perimeter
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		Assert.assertEquals("ShapeCompareTo gave incorrect ordering.", 0, rect.compareTo(sqr));
		
		// Test same area, different perimeter
        Shape rect2 = new Rectangle("R2", 3.0, 12.0);
        Shape sqr2 = new Square("S2", 6.0);
        Assert.assertEquals("ShapeCompareTo gave incorrect ordering.", 1, rect2.compareTo(sqr2));
        Assert.assertEquals("ShapeCompareTo gave incorrect ordering.", -1, sqr2.compareTo(rect2));
        
        // Test different area
        Shape rect3 = new Rectangle("R3", 5.0, 4.0);
        Shape sqr3 = new Square("S3", 3.0);
        Assert.assertEquals("ShapeCompareTo gave incorrect ordering.", -1, rect3.compareTo(sqr3));
        Assert.assertEquals("ShapeCompareTo gave incorrect ordering.", -1, sqr3.compareTo(rect3));
    }
}
