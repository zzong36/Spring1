package basic_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {

//		Hello hello = new Hello();
//		hello.printHello();

		//ioc가 가지고 있는 컨테이너는 딱 하나 하나를 가지고 계속 돌려쓴다
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
		Hello hello1 = (Hello) context.getBean("hello");
		System.out.println(hello1);
		hello1.printHello();
		
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello2);
		hello2.printHello();
		
		Hello hello3 = context.getBean("hello", Hello.class);
	}

}

