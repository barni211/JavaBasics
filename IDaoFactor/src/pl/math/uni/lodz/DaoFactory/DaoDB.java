package pl.math.uni.lodz.DaoFactory;

public class DaoDB implements IDaoFactor
{
    private static DaoDB instance=null;
    private DaoDB(){}
    
    public static DaoDB getInstance()
    {
        if(instance==null)
            instance=new DaoDB();
        return instance;
    }
    
    @Override
    public Person getPersonById(int value) 
    {
        return new Person(value);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}