package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		int age=15;
			if(age>=18)
			{
				System.out.println("elegible for vote");
			}
			else
			{
				throw new ArrayIndexOutOfBoundsException();
			}

	}

}
