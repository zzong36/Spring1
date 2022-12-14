package di_xml_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_xml_01.xml");
		
		Car car = (Car)context.getBean("car");
		Tire hankook = context.getBean(HankookTire.class);
		Tire kumho = context.getBean("kumho", KumhoTire.class);
		
		car.setTireBrand(hankook);
		car.printTireBrand();
	}
	
}
