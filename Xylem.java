package Numbers;

public class Xylem {
	public static void main(String[] args) 
	{
		int number=121;
		int Osum=0;
		int Isum=0;
		int copy=number;
		
		while(number!=0)
		{
			if(number==copy ||number<10) {
				Osum=Osum%10;
			}else {
				Isum=Isum%10;
			}
			number=number/10;
		}
		if(Osum==Isum) {
			System.out.println("Xylem Number");
		}else {
			System.out.println("Not A xYLEM nUMBER");
		}
	}

}
