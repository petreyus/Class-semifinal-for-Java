public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double base; 

   
   public BasePlusCommissionEmployee( String first, String last,
      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBase( salary ); 
   } 

   // will break if salary is negative
   public void setBase( double salary )
   {
      base = ( salary < 0.0 ) ? 0.0 : salary; 
   } 

   
   public double getBase()
   {
      return base;
   } 

  // replace the old method
   public double earnings()
   {
      return getBase() + super.earnings();
   } 

   
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", getBase() );
   } 
} 