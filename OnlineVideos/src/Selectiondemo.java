
public class Selectiondemo {

	public static void main(String args[])
	{
		String n = "abc";
		
		switch(n)
		{
		case "abc":
			System.out.print("One");
			break;
		case "asd":
			System.out.print("two");
			break;
		case "asdasd":
			System.out.print("three");
			break;
		case "assdf":
			System.out.print("four");
			break;
		case "vbnm":
			System.out.print("five");
			break;
		default:
			System.out.print("out of range.");
		}
	}
}
