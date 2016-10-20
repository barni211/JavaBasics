package Pakiet;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;

public class Main {
    //final static Logger logger = Logger.getLogger(Main.class);
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BasicConfigurator.configure();
    	Logger logger = Logger.getRootLogger();
    	logger.setLevel(Level.INFO);
    	logger.info("Entering application.");
        Person per1;
        Person per2;
        DAOFactor dt = DAOFactor.getInstance();
        dt.setSource(EDaoFactory.DB);
        logger.trace(per1 =dt.getPersonById(10));
        dt.setSource(EDaoFactory.XML);
        logger.trace(per2 =dt.getPersonById(11));
        logger.info("Exiting application.");
    }
    
}
