package in.ashokit;


// It is a target object

public class Car {
	public void drive() {
		Engine eng = new Engine();
		int status = eng.start();

		if (status >= 1) {
			System.out.println("Jourany  is startrd");
		} else
			System.out.println("Engine having some problem");
	}
}
