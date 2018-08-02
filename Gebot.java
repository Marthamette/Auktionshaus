public class Gebot
{  
    private int zBetrag;
    private Person zKenntPerson;

    //constructor
    public Gebot(int pBetrag, Person pPerson)
    {
        setBetrag(pBetrag);
        setPerson(pPerson);
    }

    private void setBetrag(int pBetrag)
    {
        if (pBetrag > 0)
        {
            this.zBetrag = pBetrag;
        }
        else 
        {
            this.zBetrag = 0;
        }
    }   
    
    public int getBetrag() 
    {
        return this.zBetrag;
    }
    
    private void setPerson(Person pPerson)
    {
        this.zKenntPerson = pPerson;
    }   

    public Person getPerson() 
    {
        return this.zKenntPerson;
    }
}
