package in.ashokit;

public class CreditcardPayment implements Ipayment {

	@Override
	public String pay(double amount) {
		// logic for credit card payment
		return "Payment successfull through credit card";
	}

}
