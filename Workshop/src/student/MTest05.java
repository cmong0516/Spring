package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = 
		new ClassPathXmlApplicationContext("student/student.xml");
		Student bean1 = ac.getBean("student1", Student.class);
		Student bean2 = ac.getBean("student2", Student.class);
		Student bean3 = ac.getBean("student3", Student.class);
		System.out.println(bean1.toString());
		System.out.println(bean2.toString());
		System.out.println(bean3.toString());
	}

}
