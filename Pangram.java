import java.util.Scanner;
public class Pangram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the text");
String a=s.nextLine();
int count=0;
		for(char x='a';x<='z';x++)
			{
				if(a.contains(String.valueOf(x)))
				{
					count++;
				}
				
			}
		
		if(count==26)
		{
			System.out.println("Entered text is a pangram");
		}
		else
		{
			System.out.println("Entered text is not a pangram");
		}
		
	}

}
