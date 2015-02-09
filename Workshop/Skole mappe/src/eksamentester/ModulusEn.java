package eksamentester;
public class ModulusEn
{
	public static void main(String[] args)
	{
		int t = 1;
		for( int i = 0; i < 15; i++)
			if (i % 3 == 0)
				System.out.print(i);
		t++;
		System.out.println(t);
	}
}