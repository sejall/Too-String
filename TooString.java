class TooString
{
	private int x,y;
	TooString()
	{
		x=y=-0;
	}
	TooString(int x1,int y1)
	{
		x=x1;
		y=y1;
	} 
	public String toString()
	{
		return(x+", "+y);
	}
}
class ToStringTest1
{
	public static void main(String args[])
	{
		TooString a1=new TooString(5,6);
		System.out.println(a1);
		String s1=" object a1 is"+a1;
		System.out.println(s1);
		
	}
}