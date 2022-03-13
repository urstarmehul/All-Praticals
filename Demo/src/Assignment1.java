import java.lang.runtime.ObjectMethods;
import java.util.*;

class Employee
{
	String name;
	int age;
	int salary;
	String designation;
	public void input()
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your name: ");
	        name=sc.next();
	        System.out.println("Enter your age: ");
	        age= sc.nextInt();
	        System.out.println("Enter your salary: ");
	        salary=sc.nextInt();
	        System.out.println("Enter your designation: ");
	        designation =sc.next();
	    }
	    public void display()
	    {
	        System.out.println("Name is : "+name);
	        System.out.println("Age : "+age);
	        System.out.println("salary : "+salary);
	        System.out.println("Desigantion : "+designation);
	    }

	}
	class Clerk1 extends Employee
	{
	    void addClerk()
	    {
	        input();
	    }
	    void showClerk()
	    {
	        display();
	    }
	}

	class Programmer extends Employee
	{
	    void addProgrammer()
	    {
	        input();
	    }
	    void showProgrammer()
	    {
	        display();
	    }
	}

	class Manager1 extends Employee
	{
	    void addManager()
	    {
	        input();
	    }
	    void showManager()
	    {
	        display();
	    }
	}
	public class Assignment1 {
	    public static void main(String args[])
	    {
	        Scanner sc =new Scanner(System.in);
	        int ch=0,ch2=0;
	        Clerk1 c=new Clerk1();
	        Programmer p=new Programmer();
	        Manager1 m=new Manager1();
	        do
	        {
	            System.out.println("*******************************");
	            System.out.println("1. Create");
	            System.out.println("2. Display");
	            System.out.println("3. Exit");
	            System.out.println("*******************************");
	            System.out.print("Enter Your Choice: ");
	            ch=sc.nextInt();

	            if(ch == 1)
	                do{
	                    System.out.println("*******************************");
	                    System.out.println("1. Clerk");
	                    System.out.println("2. Programmer");
	                    System.out.println("3. Manager");
	                    System.out.println("4. Exit");
	                    System.out.println("*******************************");
	                    System.out.print("Enter Your Choice: ");
	                    ch2=sc.nextInt();
	                    switch(ch2)
	                    {
	                        case 1:
	                            c.addClerk();
	                            System.out.println("clerk");
	                            break;
	                        case 2:
	                            p. addProgrammer();
	                            System.out.println("Programmer");
	                            break;
	                        case 3:
	                            m. addManager();
	                            System.out.println("Manager");
	                            break;
	                        default: System.out.println("Please enter Correct Choice!");
	                    }
	                }while (ch2!=4);
	            if(ch == 2)
	            {
	                int ch3;
	                System.out.println("1. Clerk");
	                System.out.println("2. Programmer");
	                System.out.println("3. Manager");
	                ch3=sc.nextInt();
	                switch (ch3)
	                {
	                    case 1:
	                        c.showClerk();
	                        break;
	                    case 2:
	                        p.showProgrammer();
	                        break;
	                    case 3:
	                        m.showManager();
	                        break;
	                }

	            }
	        }while (ch!=3);

	    }
}


