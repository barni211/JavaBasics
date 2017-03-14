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
    
    //do refaktoru, tutaj ma by� mapa z typami, �eby nie by�o �adnych if�w, wtedy b�dzie ok, klucz -> warto��

@Override
    public Person getPersonById(int value) {
      return dao.getPersonById(value);//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
