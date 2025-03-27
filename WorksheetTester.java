public class WorksheetTester
{
	public static void main(String[] args)
	{
	First f1 = new First();
	First f2 = new Second();
	First f3 = new Third();

//  #1 - uncomment line below	
//	f1.methodOne(); System.out.println();
 
//  #2 - uncomment line below
//	f1.methodTwo(); System.out.println();

//  #3 - uncomment line below 
//	f2.methodOne(); System.out.println(); 

//  #4 - uncomment line below
//	f2.methodTwo(); System.out.println();
 
//  #5 - uncomment line below
//	f3.methodOne(); System.out.println();
 
//  #6 - uncomment line below
	f3.methodTwo(); System.out.println();			 
	
	}
}

class First
{
   public void methodOne()
   {
     System.out.print("1");
   }
	
   public void methodTwo()
   {
	methodOne();
	System.out.print("2");
   }
}

class Second extends First
{
  public void methodOne()
  {
	super.methodOne();
	System.out.print("A");
  }
	
  public void methodTwo()
  {
	super.methodTwo();
	System.out.print("B");
  }
}

class Third extends Second
{
  public void methodOne()
  {
      System.out.print("X");
      super.methodOne();
  }
	
  public void methodTwo()
  {
	System.out.print("Y");
	super.methodTwo();
  }
}



