package eksamentester;
public class TallTrapp
{
	public static void main(String [] args)
	{
		int tall;
		for (tall = 1; tall <= 5; tall++)
		{
			System.out.print(tall);
			for (int tegn = 1; tegn <= tall; tegn ++)
			{
				System.out.print("=");
			}
			System.out.println("+");
		}
	}
}