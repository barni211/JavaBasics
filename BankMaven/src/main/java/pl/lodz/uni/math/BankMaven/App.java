package pl.lodz.uni.math.BankMaven;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.lodz.uni.math.BankMaven.Bank.Bank;
import pl.lodz.uni.math.BankMaven.User.Account;
import pl.lodz.uni.math.BankMaven.User.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//BasicConfigurator.configure();
    	/*Logger logger = Logger.getAnonymousLogger();
    	logger.setLevel(Level.INFO);
    	logger.info("Entering application.");
    	
    	Date date = new Date(); 
    	int value = 7654;
	   	Bank mBank = new Bank("mBank");
	   	
	   	User bartek = new User("bartek","bartek");
	   	User kamil = new User("Kamil","Kamil");
	   	
        Account konto = new Account(bartek,value,mBank);
        Account kontoDrugie = new Account(kamil,value,mBank);
        
        Transaction tran1=new Check(konto,date,"brak opisu",(Integer)1300);
        Transaction tran2=new Deposit(konto,date,"brak opisu",(Integer)2000);
        Transaction tran3=new WireOut(bartek, konto,kontoDrugie,date,"brak opisu",(Integer)2000,"swift");
        
        tran1.doTransaction();
        tran2.doTransaction();
        tran3.doTransaction();
        
        Account kontoTrzecie = new Account(bartek,value,mBank);
        Account kontoCzwarte = new Account(kamil,value,mBank);
        
        Transaction tran4=new Check(konto,date,"brak opisu",(Integer)1300);
        Transaction tran5=new Deposit(konto,date,"brak opisu",(Integer)2000);
        Transaction tran6=new WireOut(bartek, konto,kontoDrugie,date,"brak opisu",(Integer)2000,"swift");
        
        tran4.doTransaction();
        tran5.doTransaction();
        tran6.doTransaction();
        
        Transaction tran7=new Check(kontoTrzecie,date,"brak opisu",(Integer)1300);
        Transaction tran8=new Deposit(kontoTrzecie,date,"brak opisu",(Integer)2000);
        Transaction tran9=new WireOut(bartek, kontoTrzecie,kontoDrugie,date,"brak opisu",(Integer)2000,"swift");
        
        tran7.doTransaction();
        tran8.doTransaction();
        tran9.doTransaction();
        
        logger.info("Closing app.");*/
    }
}
