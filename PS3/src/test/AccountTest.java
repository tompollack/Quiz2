package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		Date d = new Date();
		Account test = new Account(1122,20000);
		test.setAIR(4.5);
		assertEquals(test.getId(), 1122);
		assertEquals(test.getBalance(), 20000, 0);
		assertEquals(test.getAIR(), 4.5, 0);
		try {
			test.withdraw(2500);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(test.getBalance(), 17500, 0);
		test.deposit(3000);
		assertEquals(test.getBalance(), 20500, 0);
		System.out.println(test.getBalance() +"\n"+ test.getMonthlyInterestRate()+"\n"+test.getDate().toString());
		test.setId(1000);
		assertEquals(test.getId(), 1000);
		test.setBalance(150.34);
		assertEquals(test.getBalance(), 150.34, 0);
		try {
			test.withdraw(100000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
