
public class printing 
{
	public static void main(String [] args)
	{
		int bottles=99;
		String bottle=" bottles ";
		while(true)
		{
			System.out.println(bottles+ bottle+ "of bear on the wall, " + bottles + bottle+ "of beer." );
			if(bottles==2)
			{
				bottle=" bottle ";
			}
			else if(bottles==1)
			{
				bottle=" no more bottles ";
				--bottles;
				System.out.println("Take one down and pass it around," + bottle + "of beer on the wall.");
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				bottles=99;
				System.out.print("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
				break;
			}
			if(bottles!=1)
			{
				System.out.println("Take one down and pass it around, "+ (--bottles) + bottle + "of beer on the wall.");	
			}		
		}	
	}
}