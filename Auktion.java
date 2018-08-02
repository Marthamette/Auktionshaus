public class Auktion 
{
    private Posten zHatPosten1;
    private Posten zHatPosten2;
    private Posten zHatPosten3;
    private Posten zHatPosten4;
    private Posten zHatPosten5;
    
    //constructor
    public Auktion() 
    {
        this.zHatPosten1 = new Posten(1, "Test1", 10);
        this.zHatPosten2 = new Posten(2, "Test2", 20);
        this.zHatPosten3 = new Posten(3, "Test3", 30);
        this.zHatPosten4 = new Posten(4, "Test4", 40);
        this.zHatPosten5 = new Posten(5, "Test5", 50);
    }
    
    //output whenb game has been ended and who won bla bla
    public void auktionsende() 
    {
        System.out.println(" ");
        System.out.println("Die Auktion wurde erfolgreich beendet!");
        for (int i = 1; i < 6; i++)
        {
            if (getPosten(i).getGebot() != null) 
            {
                System.out.println(getPosten(i).getBieter().getName()+" hat den Posten"+
                + i + " mit "+ getPosten(i).getBieterGebot() + " Euro ersteigert.");
            } 
            else 
            {
                System.out.println("Posten [" + i + "] wurde nicht ersteigert:(");
            }
        }    
        System.out.println(" ");        
    }
    
    //method for betting on stuffs and it also has error messages when something goes worng
    public void bieteFuer(int pPostennummer, Person pBieter, int pBetrag) 
    {
        boolean vaild = false;
        if (getPosten(pPostennummer).getGebot() == null)
        {
            if (getPosten(pPostennummer).getMindestgebot() > pBetrag) 
            {
                    System.out.println("WUPS: Der gebotene Betrag von " + pBieter.getName() + " für den Posten " + pPostennummer + " liegt unter dem Mindestgebot.");
                    System.out.println("WUPS: Das Mindestgebot beträgt " + getPosten(pPostennummer).getMindestgebot() + " Euro.");
            } 
            else 
            {
                vaild = true;
            }
        } 
        else 
        {
            if (getPosten(pPostennummer).getBieterGebot() > pBetrag)
            {
                System.out.println("WUPS: Der höhste gebotene Betrag für den Postens " + pPostennummer + " beträgt " + getPosten(pPostennummer).getBieterGebot()+".");
                System.out.println("WUPS: Du musst diesen überbieten.");
            } 
            else 
            {
                vaild = true;
            }
        }
        if (vaild)
        {
            getPosten(pPostennummer).setGebot(new Gebot(pBetrag, pBieter));
            System.out.println(pBieter.getName() + " hat für den Posten " + pPostennummer + " ein neues Gebot abgegeben: " + pBetrag + " Euro.");
        }
    }
    
    //assigning posts to nummbers
    private Posten getPosten(int pNummer)
    {
        if (pNummer == 1)
        {
            return this.zHatPosten1;
        }
        else if (pNummer == 2)
        {
            return this.zHatPosten2;
        }
        else if (pNummer == 3)
        {
            return this.zHatPosten3;
        }
        else if (pNummer == 4)
        {
            return zHatPosten4;
        }
        else if (pNummer == 5)
        {
            return this.zHatPosten5;
        }
        else
        {
            System.out.println("WUPS: Der Posten " + pNummer + " exestiert nicht!");
            return null;
        }
    }
}
