package di_xml_02;

import java.util.List;

public class Car {
	
	private Tire tire;
	private String msg;
	private int num;
	private List<String> list;
	
	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Car() {
//		hankookTire = new HankookTire();
		System.out.println("Car() 생성자입니다.");
	}
	
	// DI - dependency injection
	// 생성자 주입 (sethankookTire를 부를 필요가 없다)
	public Car(Tire tire) {
		System.out.println("Car(Tire tire) 생성자 입니다");
		this.tire =tire;
	}
	
	
	//생성자
	public Car(Tire tire, String msg) {
		this.tire = tire;
		this.msg = msg;
	}
	
	public Car(int num, String msg) {
		this.num = num;
		this.msg = msg;
	}
	
	public Car(List<String> list) {
		System.out.println("Car(List<String> list) 생성자 입니다");
		this.list = list;
	}
	
	//setter 주입
	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + tire.getTireBrand());
	}

	//setter 주입
	public void setTireBrand(Tire tire) {
		this.tire = tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void printMsg() {
		System.out.println("msg: " + msg);
	}
	
	public void printNum() {
		System.out.println("num: " + num);
	}
	
	public void printList() {
		if(list != null) {
			for(String a : list) {
				System.out.println(a);
			}
		}
	}
	
}
