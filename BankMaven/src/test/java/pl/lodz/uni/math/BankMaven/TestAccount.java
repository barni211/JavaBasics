package pl.lodz.uni.math.BankMaven;




import pl.lodz.uni.math.BankMaven.Bank.Bank;
import pl.lodz.uni.math.BankMaven.User.User;
import pl.lodz.uni.math.BankMaven.Transaction.Check;
import pl.lodz.uni.math.BankMaven.Transaction.Deposit;
import pl.lodz.uni.math.BankMaven.Transaction.WireOut;
import pl.lodz.uni.math.BankMaven.User.Account;

import java.util.Date;
import java.util.logging.Logger;

import org.easymock.EasyMock;
import org.easymock.MockType;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;


public class TestAccount {
	private static Account acc1;
	private static Bank bank1;
	private static User user1;
	private static Logger logger;
	

	@Before
	public void onceExecutedBeforeAll() {
		//BasicConfigurator.configure();
		
		user1 = EasyMock.createMock(User.class);
		bank1 = EasyMock.createMock(Bank.class);
		acc1 = new Account(user1, 12323231,bank1);
		logger = Logger.getAnonymousLogger();
	}

	
	@Test
	public void TestGetSaldo()
	{
		int result = acc1.getSaldo();
		int expected = 0;
		
		Assert.assertEquals(result, expected);	
	}
	
	@Test
	public void TestSaldoPlus()
	{
		//Logger logger = Logger.getAnonymousLogger();
		try {
			acc1.saldoPlus(25);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail();
		}
		Integer result=acc1.getSaldo();
		Integer expected=25;
		logger.info(result.toString() + " and " + expected.toString());
		Assert.assertEquals(result,expected);
	}
	
	@Test ()
	public void TestSaldoPlusException()
	{
		Exception expected=new Exception("Nie można dodać wartości ujemnej, niż 0");
		//Logger logger = Logger.getAnonymousLogger();
		try
		{
		acc1.saldoPlus(-25);
		Assert.fail();
		}
		catch (Exception ex)
		{
			Assert.assertEquals(expected.toString(), ex.toString());
			return;
		}
		Assert.fail();
		//Integer result=acc1.getSaldo();
		//Integer expected=25;
		//logger.info(result.toString() + " and " + expected.toString());
		//Assert.assertEquals(result,expected);
	}
	
	@Test
	public void TestSaldoMinus()
	{
		//Logger logger = Logger.getAnonymousLogger();
		acc1.saldoMinus(25);
		Integer result=acc1.getSaldo();
		Integer expected=-25;
		//logger.info(result.toString() + " and " + expected.toString());
		Assert.assertEquals(result,expected);
	}
	
	@Test
	public void TestCountChecks()
	{
		//Logger logger = Logger.getAnonymousLogger();
		Integer result = acc1.countChecks();
		Integer expected = 100;
		logger.info(result.toString() + " and " + expected.toString());
		Assert.assertEquals(result,expected);
	}
	
	@Test
	public void TestDeposit()
	{
		//Logger logger = Logger.getAnonymousLogger();
		acc1.Deposit();
		Integer result=acc1.countDeposits();
		Integer expected = 1001;
		logger.info(result.toString() + " and " + expected.toString());
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void TestCountDeposit()
	{
		//Logger logger = Logger.getAnonymousLogger();
		Integer result = acc1.countDeposits();
		Integer expected = 1000;
		logger.info(result.toString() + " and " + expected.toString());
		Assert.assertEquals(result,expected);
	}
	
	@Test
	public void TestAddToHistory() throws Exception
	{
	
		//Date date = new Date(); 
		//User user2 = EasyMock.createMock(User.class);
		//Account acc2 = EasyMock.createMock(Account.class);
		Check t = EasyMock.createMock(Check.class);
		acc1.addToHistory(t);
		Deposit d = EasyMock.createMock(Deposit.class);
		acc1.addToHistory(d);
		WireOut w = EasyMock.createMock(WireOut.class);
		acc1.addToHistory(w);
		Integer result = acc1.getHistory().size();
		Integer expected = 3;
		logger.info(result.toString() + " and " + expected.toString());
		Assert.assertEquals(result,expected);
	}
}
