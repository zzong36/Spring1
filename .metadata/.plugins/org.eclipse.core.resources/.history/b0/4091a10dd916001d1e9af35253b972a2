package di.basic;

public class DriverMain {

	public static void main(String[] args) {
		
		
		//타이어 설정 생성
		HankookTire hankookTire = new HankookTire();
		
		// 생성자 주입(미리 만들어둔 타이어를 주입해줌)
		Car car = new Car(hankookTire);
		
		// setter 주입
//		Car car = new Car();
//		car.sethankookTire(hankookTire);
		car.printTireBrand();
	}
}
