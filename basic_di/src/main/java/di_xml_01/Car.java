package di_xml_01;

public class Car {
	
	private Tire tire;

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
	
	
	//setter 주입
	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + tire.getTireBrand());
	}

	public void setTireBrand(Tire tire) {
		this.tire = tire;
	}
	
}
