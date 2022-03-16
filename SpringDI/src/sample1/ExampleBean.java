package sample1;

public class ExampleBean implements MessageBean {
	private String fruit;
	private int cost;
	
	
	
	public ExampleBean() {
		super();
		this.fruit ="수박";
		this.cost =20000;
	}

	

	public ExampleBean(String fruit, int cost) {
		super();
		this.fruit = fruit;
		this.cost = cost;
	}



	@Override
	public void sayHello() {
		System.out.println(this.fruit+"\n" + this.cost+"원");
	}

	
	
	
	
	
	
	
	
	
	
}
