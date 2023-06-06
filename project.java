import java.util.Scanner;

public class Project
{
public static void main(String s[])
{

char r;
	
do
{
	
System.out.println("**** Library Management System****");

System.out.println("Press 1 to add book");

System.out.println("Press 2 to issue a book");

System.out.println("Press 3 to return a book");

System.out.println("Press 4 to print complete issue details");

System.out.println("Press 5 to exit");
	
Scanner obj1=new Scanner(System.in);
	
System.out.println("Enter any number");
	
int a=obj1.nextInt();

switch(a)
	
	{
		
case 1:
		
Library l1=new Library();
		
		l1.add();
		
		break;
		
		case 2:
		
		Library l2=new Library();
		
		l2.issue();
		
		break;
		
		case 3:
		
		Library l3=new Library();
		
		l3.Return();
		
		break;
		
		
		case 4:
		
		Library l4=new Library();
		
		l4.detail();
		
		break;
		
		case 5:
		
		Library l5=new Library();
		
		l5.exit();
		
		break;
		
		default:
		
		System.out.println("Invalid number");		
		
	}

System.out.println("you want to select next option  Y/N");


r=obj1.next().charAt(0);
}

while(r=='y'||r=='y');

if(r=='n'||r=='N');

{
	
	Library z=new Library();
	
	z.exit();
	
	}					

}
} 
class Library
{
static	String s1,b,date;
	
static	int a,c;
	
	void add()
	{
		System.out.println("Enter book name,Price and Book number");
		
		Scanner obj2=new Scanner(System.in);
		
String s1=obj2.nextLine();

float price=obj2.nextInt();

int booknumber=obj2.nextInt();

System.out.println("your details is" + s1  +  price   +  booknumber);
	
	}
	
	void issue()
	
	{
		
		Scanner obj3=new Scanner(System.in);
		
		System.out.println("Book name");
		
		s1=obj3.nextLine();
		
		System.out.println("Bookid");
		
		a=obj3.nextInt();
		
		obj3.nextLine();
		
		System.out.println("Issue date");
		
		b=obj3.nextLine();
		
		System.out.println("Total number of books Issued");
		
		c=obj3.nextInt();
		
		obj3.nextLine();
		
		System.out.println("Return book date");
		
		date=obj3.nextLine();
		
		
		
	}
	
	int getid()
	
	{
		
		return a;
		
	}
	
	void Return()
	
	{
		
		System.out.println("Enter  Student name  & bookid");
		
		Scanner sc=new Scanner(System.in);
		
		String  name=sc.nextLine();
		
		int bookid=sc.nextInt();
		
		if(a==bookid)
		{
			
			System.out.println("total details");
			
			System.out.println("Book name ::" + Library.s1);
			
			
		System.out.println("Book id ::" +Library.a);
		
		System.out.println("issue date"+ Library.b);
		
		System.out.println("total number of Book Issued ::" + Library.c);
		
		System.out.println(" Book Return date ::" + Library.date);
		}
		
		else
		
		{
			
			System.out.println("Wrong id,pls enter correct id");
		}
		
	}
		

void detail()

{

			
			System.out.println("Book name ::" +Library.s1);
			
			
		System.out.println("Book id ::" + Library.a);
		
		System.out.println("issue date"+ Library.b);
		
		System.out.println("total number of Book Issued ::" +Library.c);
		
		System.out.println(" Book Return date ::" + Library.date);
	
}
	
	void exit()
	
	{
		
		System.exit(0);
		
		
	}
}
	

		
		
		
		
		

