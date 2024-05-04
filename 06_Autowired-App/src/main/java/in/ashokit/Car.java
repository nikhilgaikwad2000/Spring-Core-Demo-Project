package in.ashokit;

public class Car {

	private DiselEngine diselEng;

	public void setDiselEng(DiselEngine diselEng) {
		this.diselEng = diselEng;
	}

	public Car() {
		System.out.println("Car ::Constructor");
	}
        
	public Car(DiselEngine diselEng) {
		System.out.println("car::param constructor");
		this.diselEng=diselEng;
	}

	public void drive() {
		int start = diselEng.Start();
		if (start >= 1) {
			System.out.println("Jourany Started");
		} else {
			System.out.println("Engine Failed to start");
		}
	}

}
