package Pakiet;

public class DaoXML implements IDaoFactor
{
    private static DaoXML instance=null;
    
    public static DaoXML getInstance()
    {
        if (instance==null)
            instance=new DaoXML();
        return instance;
    }
    
    private DaoXML() 
    {

    }
    @Override
    public Person getPersonById(int value)
    {
        return new Person(value);
    }
    
}