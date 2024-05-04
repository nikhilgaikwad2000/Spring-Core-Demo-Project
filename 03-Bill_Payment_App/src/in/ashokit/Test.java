package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		// **injecting credit card object into Billcollector(SetterInjection)**

		BillCollector bc = new BillCollector();
		bc.setPayment(new DebitcardPayment());
		bc.collectpayment(1200.00);

		// **injecting credit card object into Billcollector(ConstructorInjection)**

//		BillCollector bc1 = new BillCollector(new CreditcardPayment());
//		bc1.collectpayment(1300.00);

		
		
		
		// **injecting credit card object into Billcollector(FieldInjection)**

		/*
		 * Class<?> clz = Class.forName("in.ashokit.BillCollector");
		 * 
		 * Field field = clz.getDeclaredField("payment"); field.setAccessible(true);
		 * 
		 * Object obj = clz.newInstance(); field.set(obj, new DebitcardPayment());
		 * BillCollector bc = (BillCollector) obj; bc.collectpayment(1200.00);
		 */

	}
}
