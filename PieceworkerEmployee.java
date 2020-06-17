
//this class is an extension of the employee 
public class PieceworkerEmployee extends Employee{
    private double wage; 
    private int pieces; 

public PieceworkerEmployee( String first, String last, String ssn,
     double wages, int piece )
   {
     super( first, last, ssn );
      setWages( wages );
      setPieces( piece );
   }

     public void setWages(double wages)
    {
        wage=(wages>0.0)?wages:0.0;
    }

  
public double getWages()
    {
        return wage;
    }


    public void setPieces(int piece)
    {
        pieces=(piece<0)?0:piece;
    }

    public int getPieces()
    {
        return pieces;
    }
// this is the new type of earnings they will get wages X how many they made
    public double earnings()
    {
        return getWages()*getPieces();
    }



    public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %,d",
         "Piece worker",super.toString(), "earned per piece", getWages(),
         "items produced", getPieces() );
   }
}