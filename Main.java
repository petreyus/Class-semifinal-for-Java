
public class Main
{

   public static void main( String args[] )
   {
     
     SalariedEmployee salariedEmployee =
        new SalariedEmployee( "Josiah", "Balthazar", "111-11-1111", 400.00 );
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee( "Kenny", "Lewis", "222-22-2222", 10.55, 40 );
      CommissionEmployee commissionEmployee =
        new CommissionEmployee(
         "John", "Jacobs", "333-33-3333", 50000, .03 );
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(
         "Robert", "Blues", "444-44-4444", 50000, .03, 300 );
     
PieceworkerEmployee pieceworkerEmployee = new PieceworkerEmployee("John","Tier","555-55-5555",60.00,20);
      System.out.println( "Employees processed individually:\n" );

      System.out.printf( "%s\n%s: $%,.2f\n\n",
         salariedEmployee, "garnered", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "garnered", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "garnered", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         basePlusCommissionEmployee,
         "garnered", basePlusCommissionEmployee.earnings() );
      System.out.printf("%s\n%s: $%,.2f\n\n", pieceworkerEmployee,"garnered",pieceworkerEmployee.earnings());

     
      Employee employees[] = new Employee[ 5 ];

     
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee;
      employees[ 3 ] = basePlusCommissionEmployee;
      employees[ 4 ] = pieceworkerEmployee;

        }

}


