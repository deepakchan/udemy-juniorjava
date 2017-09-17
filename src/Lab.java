import java.util.Random;

public class Lab {

	public static void main(String[] args) {
		Student stu1=new Student("Deepak","1234123454");
		Student stu2=new Student("ChandraB","8958573898");
		Student stu3=new Student("Sindhura","1873278274");
		stu1.setPhone("City");
		stu1.setState("LA");
		stu1.setPhone("283-182-1838");
		stu1.getCity();
		stu1.getState();
		stu1.getPhone();
		stu1.enroll("Maths");
		stu1.enroll("English");
		stu1.showCourses();
		stu1.payTution(1000);
		stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

class Student
{
	private String name;
	private String ssn;
	private String email;
	private String userId;
	private static int ID=1000;
	private String courses="";
	private int costOfCourse=900;
	private int balance;
	public String phone;
	public String city;
	public String State;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setAccountID();
	}
	
	public void setEmail()
	{
		email=name.toLowerCase()+"."+ID+"@dcnsuniversity.com";
		System.out.println("Your email: "+email);
	}
	
	public void setAccountID()
	{
		Random r=new Random();
		int random=r.nextInt(8000)+1000;
		userId=ID+""+random+ssn.substring(6);
		System.out.println("User ID: "+userId);
	}
	
	
	public void enroll(String course)
	{
		this.courses=this.courses+"\n"+course;
		System.out.println(courses);
		balance=balance-costOfCourse;
	}
	
	public void payTution(int amount)
	{
		balance=balance-amount;
		System.out.println("Payment: $"+amount);
	}
	
	public void checkBalance()
	{
		System.out.println("Balace: $"+balance);
		
	}
	
	public void showCourses()
	{
		System.out.println(courses);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ssn=" + ssn + ", email=" + email + ", userId=" + userId + ", courses="
				+ courses + ", costOfCourse=" + costOfCourse + ", balance=" + balance + "]";
	}
}
