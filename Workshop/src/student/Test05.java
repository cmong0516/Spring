package student;

public class Test05 {
	public static void main(String[] args) {
		Student kim = new Student("Kim",100,90,95,89);
		Student lee = new Student("Lee",60,70,99,98);
		Student park = new Student("Park",68,86,60,40);
		
		System.out.println(kim.toString());
		System.out.println(lee.toString());
		System.out.println(park.toString());
	}
}
