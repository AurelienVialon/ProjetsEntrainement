public class HammingDistance 
{
	public static void main(String[] args) 
	{
		System.out.println("Hamming Distance est : " + HammingDistance(3,1));
	}
	
	public static int HammingDistance(int x, int y)
	{
			String bx = Integer.toBinaryString(x), by = Integer.toBinaryString(y);
			int h = 0;
			
			System.out.println(bx);
			System.out.println(by);
			
			if(bx.length() != by.length())
			{		
				if(bx.length()<by.length())
					while(bx.length()<by.length())
						bx="0" + bx;
				else
					while(bx.length()>by.length())
						by="0" + by;
			}
			
			System.out.println(bx);
			System.out.println(by);
			
			
			while(!bx.equals("") && !by.equals(""))
			{	
				if (bx.charAt(0)!=by.charAt(0))
				{
					h++;
				}
				bx = bx.substring(1);
				by = by.substring(1);
			}	
			return h;
		}
}