
class ANewClass
{
	void display()
	{
		System.out.println("Original display");
	}
	void show()
	{
		System.out.println("Original show");
	}


}
class AA
{
	void input()
	{
		ANewClass ob=new ANewClass(){

		void display()
		{
			System.out.println("In input=>display");
			fun();
		}
		
		void fun()
		{
			System.out.print("\nExtra Method has been added " );
		}
		};
		ob.display();
	
		ob.show();
	}
	void output()
	{
		ANewClass ob=new ANewClass(){

		void display()
		{
			System.out.println("In output=>display");
		}
		void show()
		{
		       System.out.println("Modified Show");
		}
		};
		ob.display();
		ob.show();
	}


}

public class AnnonymousInner1 {

      public static void main(String args[])
    {
    	AA obj=new AA();
    	obj.input();
    	obj.output();
    }

}