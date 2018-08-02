public class Person 
{   
    private String zName;

    //constructor
    public Person(String pName) 
    {
        setName(pName);
    }

    private void setName(String pName) 
    {
        this.zName = pName;
    }

    public String getName() 
    {
        return this.zName;
    }
} 