package pl.lodz.uni.math.BankMaven;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.logging.Logger;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pl.lodz.uni.math.BankMaven.Transaction.Transaction;
import pl.lodz.uni.math.BankMaven.Transaction.Deposit;
import pl.lodz.uni.math.BankMaven.User.Account;

public class TestDeposit {

	private static Account acc1;
	private static Logger logger;
	private static Date date1;
	

	@Before
	public void onceExecutedBeforeAll() {
		//BasicConfigurator.configure();
		acc1 = EasyMock.createMock(Account.class);
		logger = Logger.getAnonymousLogger();
		EasyMock.expect(acc1.countDeposits()).andReturn(1);
	}

	@Test
	public void test() {
		Transaction wo = new Deposit(acc1,date1,"desc",3000);
		boolean result = wo.doTransaction();
		Assert.assertEquals(true, result);
	}


}
