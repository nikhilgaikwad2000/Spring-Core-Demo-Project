package in.ashokit;

public class DebitcardPayment implements Ipayment {

	@Override
	public String pay(double amount) {
		// logic for debit card payment
		return "Payment Successfull through the Debit card";
	}

}
