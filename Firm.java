/**
  * Firm.java represents a Firm that has different types of employees. And it will attempt to pay them all
  *  @author(s) Chien Lin, Lena Zheng, Qd Li
  *  @version 1.0
  *  @since 2017-11-19
*/

/*
  * Algorithm:
  * 1. Initialize staff
  * 2. Set staff's pay
  * 3. Pay staff
*/
public class Firm
{
   //-----------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
  public static void main (String[] args)
  {
	Staff personnel = new Staff();

	personnel.payday();
  }
}
