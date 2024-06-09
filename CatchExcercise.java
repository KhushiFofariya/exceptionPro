package exceptionPro;

public class CatchExcercise extends BaseClass {

	public CatchExcercise()
	{
		this.name="CatchExcercise";
	}
	public void execute() {
		try
		{
			int[] a = new int[5];
			a[5]=30/5;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds."+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatchExcercise ce = new CatchExcercise();
		ce.displayMsg();
		ce.execute();
	}

}
