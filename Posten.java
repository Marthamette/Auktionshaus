public class Posten
 {
    private int zNummer;
    private String zBeschreibung;
    private int zMindestgebot;
    private Gebot zKenntGebot;
    
    //constructor
    public Posten(int pNummer, String pBeschreibung, int pMindestgebot)
    {
        setNummer(pNummer);
        setBeschreibung(pBeschreibung);
        setMindestgebot(pMindestgebot);
    }
    
    private void setNummer(int pNummer)
    {
        if (pNummer > 0)    
        {  
            this.zNummer = pNummer;
        } 
        else
        {
            this.zNummer = -1;
        }
    }
    public int getNummer()
    {
        return this.zNummer;
    }
    
    private void setBeschreibung(String pBeschreibung)
    {
        this.zBeschreibung = pBeschreibung;
    }
    public String getBeschreibung() 
    {
        return this.zBeschreibung;
    }
    
    private void setMindestgebot(int pMindestgebot)
    {
        if (pMindestgebot > 0)
        {
            this.zMindestgebot = pMindestgebot;
        } 
        else
        {
            this.zMindestgebot = 0;
        }
    }
    public int getMindestgebot() 
    {
        return this.zMindestgebot;
    }
    
    public void setGebot(Gebot pGebot) 
    {
        this.zKenntGebot = pGebot;
    }
    public Gebot getGebot()
    {
        return this.zKenntGebot;
    }
    
    public Person getBieter()
    {
        return getGebot().getPerson();  
    }
    
    public int getBieterGebot() 
    {
        return getGebot().getBetrag();  
    }
}
