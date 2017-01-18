package pl.lodz.uni.math.BankMaven;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.logging.Logger;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pl.lodz.uni.math.BankMaven.Transaction.Check;
import pl.lodz.uni.math.BankMaven.Transaction.Transaction;
import pl.lodz.uni.math.BankMaven.User.Account;
import pl.lodz.uni.math.BankMaven.User.User;

public class TestCheck {

	private static Account acc1;
	private static User user1;
	private static Logger logger;
	private static Date date1;
	

	@Before
	public void onceExecutedBeforeAll() {
		//BasicConfigurator.configure();
		
		user1 = EasyMock.createMock(User.class);
		acc1 = EasyMock.createMock(Account.class);
		logger = Logger.getAnonymousLogger();
		EasyMock.expect(acc1.countChecks()).andReturn(1);
	}

	@Test
	public void test() {
		EasyMock.expect(acc1.countChecks()).andReturn(1);
		Transaction wo = new Check(acc1,date1,"desc",3000);
		boolean result = wo.doTransaction();
		Assert.assertEquals(true, result);
	}

}
