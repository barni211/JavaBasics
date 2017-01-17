package pl.lodz.uni.math.DaoFactorMaven;

import org.apache.log4j.*;

import pl.lodz.uni.math.DaoFactorMaven.DaoFactor.DaoFactor;
import pl.lodz.uni.math.DaoFactorMaven.DaoFactor.EDaoFactory;
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
		DaoFactor dt = DaoFactor.getInstance();
		dt.setSource(EDaoFactory.DB);
		logger.trace(per1 = dt.getPersonById(10));
		dt.setSource(EDaoFactory.XML);
		logger.trace(per2 = dt.getPersonById(11));
		logger.info("Exiting application.");
	}
}
