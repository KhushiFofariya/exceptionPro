package exceptionPro;

public class BaseClass {
	protected String name;
	public BaseClass()
	{
		this.name="Base Class";
	}
	public void displayMsg()
	{
		System.out.println("This is Message from "+name);
	}
}
