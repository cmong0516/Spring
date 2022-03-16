package sample2;

public class ListAddress {

	private Address addr;

	public ListAddress() {
		super();
		System.out.println("기본");
	}

	public ListAddress(Address addr) {
		super();
		this.addr = addr;
		System.out.println("매개인자");
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

}