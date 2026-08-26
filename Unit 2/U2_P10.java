//Write a java program to demonstrate encapsulation.
public class U2_P10{
	private String name;
	public String getName()
	{
	  return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args){
		encapsuleEx emp = new encapsuleEx();
		emp.setName("yuvraj");
		System.out.println("Employee Name :" + emp.getName());
	}
		
}