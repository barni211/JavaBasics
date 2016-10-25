package pl.math.uni.lodz.DaoFactory;

import java.util.HashMap;
import java.util.Map;


public class DAOFactor implements IDaoFactor
{
    private static IDaoFactor dao=new DAOFactor();
    Map<EDaoFactory, IDaoFactor> types = new HashMap<EDaoFactory, IDaoFactor>();
    {
    types.put(EDaoFactory.DB, DaoDB.getInstance());
	types.put(EDaoFactory.XML, DaoXML.getInstance());
	}
    protected DAOFactor(){
    }
    
    public static DAOFactor getInstance()
    {
        return (DAOFactor)dao;
    }
   
    public void setSource(EDaoFactory value) 
    {
        this.dao=types.get(value);
    }
    

@Override
    public Person getPersonById(int value) {
      return dao.getPersonById(value);//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
