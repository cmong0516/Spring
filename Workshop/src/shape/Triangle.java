package shape;

public class Triangle extends Shape implements Resize {
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (double)(getWidth()*getHeight())/2;
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setHeight(getHeight()+size);
	}

	@Override
	public String toString() {
		return "Triangle\t"+getArea()+"\t"+getColors();
	}
	
	

}
