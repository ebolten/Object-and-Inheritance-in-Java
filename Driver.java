import java.util.Scanner;
import java.lang.String;

public class Driver {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int userChoice; //getting choice for user
		
		System.out.println("1) To enter a Student");
		System.out.println("2) To enter an Employee");
		System.out.print("Choice: ");
		userChoice = input.nextInt();
		
		//getting and displaying data for student
		if(userChoice == 1) {
			
			Student.studentToString();
			System.out.println("\n");
			System.out.println("Student: "+Student.name);
			System.out.println("Status: "+Student.status);
			System.out.println("Address: "+Student.address);
			System.out.println("Phone Number: "+Student.telNum);
			System.out.println("Email Address: "+Student.emailAdd);
		}
		
		//getting and displaying data for employee
		else if (userChoice == 2) {
			Employees.employeeToString();
			int employeeChoice;
			System.out.println("1) To enter a faculty member");
			System.out.println("2) To enter a staff member");
			System.out.print("Choice: ");
			employeeChoice = input.nextInt();
		
			//getting and displaying data for faculty member
			if (employeeChoice == 1) {
				//calling method from faculty class to get user data
				Faculty.facultyToString();
				
				System.out.println("\n");
				System.out.println("Employee: "+Faculty.name);
				System.out.println("Rank: "+Faculty.rank);
				System.out.println("Salary: "+Faculty.salary);
				System.out.println("Date Hired: "+Faculty.hireDate);
				System.out.println("Office Hours: "+Faculty.officeHours);
				System.out.println("Office Number: "+Faculty.officeNum);
				System.out.println("Address: "+Faculty.address);
				System.out.println("Phone Number: "+Faculty.telNum);
				System.out.println("Email Address: "+Faculty.emailAdd);
			}
		
			//getting and displaying data for staff member
			else if (employeeChoice == 2) {
				//calling method from staff class to get user data
				Staff.staffToString();
				
				System.out.println("\n");
				System.out.println("Employee: "+Staff.name);
				System.out.println("Rank: "+Staff.title);
				System.out.println("Salary: "+Staff.salary);
				System.out.println("Date Hired: "+Staff.hireDate);
				System.out.println("Office Number: "+Staff.officeNum);
				System.out.println("Address: "+Staff.address);
				System.out.println("Phone Number: "+Staff.telNum);
				System.out.println("Email Address: "+Staff.emailAdd);
			}
		}
	}
}

//superclass person
class Person {
	protected static String name;
	protected static String address;
	protected static String telNum;
	protected static String emailAdd;
}

//creating class to declare hire date for employees

//subclass student
class Student extends Person {
	
	static Scanner input = new Scanner (System.in);
	
	//declaring statuses for students
	protected static String status;
	
	//to store information about object
	public static void studentToString() {
		System.out.print("Enter a name: ");
		Student.name = input.nextLine(); //getting student's name
		
		System.out.print("Enter " + Student.name + "'s address: ");
		Student.address = input.nextLine(); //getting student's address
		
		System.out.print("Enter " + Student.name + "'s telephone number: ");
		Student.telNum = input.nextLine(); //getting student's phone number
		
		System.out.print("Enter " + Student.name + "'s email address: ");
		Student.emailAdd = input.nextLine(); //getting student's email
		
		System.out.print("Enter " + Student.name + "'s status: ");
		Student.status = input.nextLine(); //getting student's status
	}
}

//subclass employees
class Employees extends Person {
	public static Scanner input = new Scanner (System.in);
	
	//data fields of employees class
	protected static int officeNum;
	protected static int salary;
	protected static String hireDate;
	
	//to store information about object
	public static void employeeToString() {
		System.out.print("Enter a name: ");
		Employees.name = input.nextLine(); //getting employee's name
				
		System.out.print("Enter " + Employees.name + "'s address: ");
		Employees.address = input.nextLine(); //getting employee's address
				
		System.out.print("Enter " + Employees.name + "'s telephone number: ");
		Employees.telNum = input.nextLine(); //getting employee's phone number
				
		System.out.print("Enter " + Employees.name + "'s email address: ");
		Employees.emailAdd = input.nextLine(); //getting employee's email
		}
}

//subclass staff
class Staff extends Employees {
	
	protected static String title;
	protected static String date;
	protected static MyDate hiringDate;
	
	//to store information about object
	public static void staffToString() {
		System.out.print("Enter an office number: ");
		Staff.officeNum = input.nextInt(); //getting student's name
				
		System.out.print("Enter a salary: ");
		Staff.salary = input.nextInt(); //getting student's address
		input.nextLine();
		System.out.print("Enter a hire date: ");
		date = input.nextLine();
		
		hiringDate = new MyDate(date);
		Staff.hireDate = hiringDate.getDate();

		System.out.print("Enter a title: ");
		Staff.title = input.nextLine();	
		}
}

//subclass faculty
class Faculty extends Employees {
	
	protected static String officeHours;
	protected static String rank;
	protected static String date;
	protected static MyDate hiringDate;
	
	
	//to store information about object
		public static void facultyToString() {
			System.out.print("Enter an office number: ");
			Faculty.officeNum = input.nextInt(); //getting faculty office number
			
			System.out.print("Enter a salary: ");
			Faculty.salary = input.nextInt(); //getting faculty salary
			input.nextLine();
			System.out.println("Enter a hire date: ");
			date = input.nextLine(); //getting faculty hire date
		
			hiringDate = new MyDate(date);
			
			Faculty.hireDate = hiringDate.getDate();
			
			System.out.print("Enter office hours: ");
			Faculty.officeHours = input.nextLine(); //getting office hours
			
			System.out.print("Enter a rank: ");
			Faculty.rank = input.nextLine();
					
			}
}