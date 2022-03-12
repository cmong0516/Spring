package shape;

public class Rectangle extends Shape implements Resize{
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (double)getWidth()*getHeight();
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setWidth(getWidth()+size);
	}

	@Override
	public String toString() {
		return "Rectangle\t"+getArea()+"\t"+getColors();
	}
	
	
}
