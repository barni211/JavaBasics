package Pakiet;

public class DAOFactor implements IDaoFactor
{
    private static IDaoFactor dao=new DAOFactor();
    protected DAOFactor(){}
    
    public static DAOFactor getInstance()
    {
        return (DAOFactor)dao;
    }
   
    public void setSource(EDaoFactory value) 
    {
        if(value==EDaoFactory.DB)
        {
            this.dao =  DaoDB.getInstance();
        }
        else if (value==EDaoFactory.XML)
        {
            this.dao = DaoXML.getInstance();
        }  
    }
    
    //do refaktoru, tutaj ma byæ mapa z typami, ¿eby nie by³o ¿adnych ifów, wtedy bêdzie ok, klucz -> wartoœæ

@Override
    public Person getPersonById(int value) {
      return dao.getPersonById(value);//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
