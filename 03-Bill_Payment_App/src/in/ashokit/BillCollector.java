package in.ashokit;

public class BillCollector {

	private Ipayment payment;

	// using setter method (Setter injection)
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	// using constructor (Constructor injection)

	public BillCollector() {

	}

	public BillCollector(Ipayment payment) {
		this.payment = payment;
	}

	public void collectpayment(double amount) {

		// By using this approch it is tightaly coupaling

//	CreditcardPayment ccd = new CreditcardPayment();
//	ccd.pay(amount);

		String Status = payment.pay(amount);

		System.out.println(Status);

	}
}
