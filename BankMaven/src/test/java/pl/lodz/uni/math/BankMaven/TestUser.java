package pl.lodz.uni.math.BankMaven;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import pl.lodz.uni.math.BankMaven.Bank.Bank;
import pl.lodz.uni.math.BankMaven.User.User;

public class TestUser {
	private static User user1;
	
	@BeforeClass
	public static void onceExecutedBeforeAll() {
		//BasicConfigurator.configure();
		
		user1 = new User("default","default");
	}
	
	@Test
	public void TestWireOut()
	{
		user1.wireOut();
		int result = user1.countWireOuts();
		int expected=1;
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void TestCountWireOut()
	{
		int result = user1.countWireOuts();
		int expected = 1;
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void TestAddAccount()
	{
		Bank b1 = EasyMock.createMock(Bank.class);
		boolean result = user1.addAccount(123213, b1);
		Assert.assertEquals(true, result);
	}

}
