package pl.lodz.uni.math.BankMaven;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.logging.Logger;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pl.lodz.uni.math.BankMaven.Bank.Bank;
import pl.lodz.uni.math.BankMaven.Transaction.WireOut;
import pl.lodz.uni.math.BankMaven.User.Account;
import pl.lodz.uni.math.BankMaven.User.User;

public class TestWireOut {
	
	private static Account acc1;
	private static Account acc2;
	private static Bank bank1;
	private static User user1;
	private static Logger logger;
	private static Date date1;
	

	@Before
	public void onceExecutedBeforeAll() {
		//BasicConfigurator.configure();
		
		user1 = EasyMock.createMock(User.class);
		bank1 = EasyMock.createMock(Bank.class);
		acc1 = EasyMock.createMock(Account.class);
		acc2 = EasyMock.createMock(Account.class);
		logger = Logger.getAnonymousLogger();
	}

	@Test
	public void test() {
		WireOut wo = new WireOut(user1,acc1,acc2,date1,"desc",3000,"swift");
		boolean result = wo.doTransaction();
		Assert.assertEquals(true, result);
	}

}
