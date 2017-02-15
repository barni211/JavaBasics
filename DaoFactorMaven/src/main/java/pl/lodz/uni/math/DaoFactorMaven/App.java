package pl.lodz.uni.math.DaoFactorMaven;

import org.apache.log4j.*;

import pl.lodz.uni.math.DaoFactorMaven.DaoFactor.DaoFactor;
import pl.lodz.uni.math.DaoFactorMaven.DaoFactor.EDaoFactory;
import pl.lodz.uni.math.DaoFactorMaven.DaoFactor.IDaoFactor;
import pl.lodz.uni.math.DaoFactorMaven.Person.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger logger = Logger.getRootLogger();
		logger.setLevel(Level.INFO);
		logger.info("Entering application.");
		Person per1;
		Person per2;
		Person per3;
		DaoFactor dt = DaoFactor.getInstance();
		dt.setSource(EDaoFactory.DB);
		logger.trace(per1 = dt.getPersonById(10));
		dt.setSource(EDaoFactory.XML);
		logger.trace(per2 = dt.getPersonById(11));
		logger.info("Exiting application.");
		
		DaoFactor dt2 = DaoFactor.getInstance();
		dt2.setSource(EDaoFactory.DB);
		logger.trace(per3 = dt2.getPersonById(10));
		
		
	}
}
