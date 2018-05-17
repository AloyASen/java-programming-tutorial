package Class_prog;

import java.io.*; 
class student 
{
	private String name;
	private int roll;
	student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;		
	}
	public String get_stud_name()
	{
		return name;	
	}
	public int get_stud_roll()
	{
		return roll;
	}

}
class marks extends student
{
	private int tot_marks=0;
	marks(String name, int roll ,int marks)
	{
		super(name,roll);
		tot_marks=marks;
	}
	public int get_marks()
	{
		return tot_marks;
	}
}
interface college
{
	final static int ColCode=108;
	final static String ColName="Asansol Engineering College";
	final static String ColAdd="Asansol";
}
class certificate extends marks implements college
{
	certificate (String name, int roll, int marks)
	{
		super(name,roll,marks);
		display_cert();
	}
	public void display_cert()
	{
		int marks=get_marks();
		System.out.println("My certificate--- \t ---");
		System.out.println("the sudent marks\t"+marks);
		System.out.println("the sudent name\t"+get_stud_name());
		System.out.println("the sudent roll\t"+get_stud_roll());
		System.out.println("the college name\t"+ColName);
		System.out.println("the college address\t"+ColAdd);
		System.out.println("the college code\t"+ColCode);
		System.out.println("thank you \t Certificate ends");
	}
}
class controller
{
	static int stdno=0;
	public static void main(String a[])
	{
		int Serial=0;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Provide the total no of students");
		int totStud = 0;
		try {
			totStud = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		certificate A[]=new certificate[totStud];
		do
		{
			System.out.println("Provide the details ");	
			System.out.println("Provide the student name");
			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			System.out.println("Provide the student roll");
			int roll = 0;
			try {
				roll = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Provide the student marks");
			int marks = 0;
			try {
				marks = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			A[Serial]= new certificate(name,roll,marks);
			if(Serial<totStud)
				Serial++;
		}while(Serial<=totStud);
	}

}