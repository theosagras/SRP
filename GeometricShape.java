
public class GeometricShape {
	
	private Shape drawnShape;


public GeometricShape(Shape theShape) {
		drawnShape = theShape;
	}
	
	public int getXLowerRightCorner() {
		return drawnShape.getItsWidth() + drawnShape.getXUpperLeftCorner();
	}
	
	public int getYLowerRightCorner() {
		return drawnShape.getItsHeight() + drawnShape.getYUpperLeftCorner();
	}

}
