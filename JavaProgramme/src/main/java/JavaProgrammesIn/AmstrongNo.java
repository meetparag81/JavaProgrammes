package JavaProgrammesIn;

public class AmstrongNo {

	public static void main(String[] args) 
	{
		int sum=0,a,temp,r;
		int num=153;
		temp=num;
		while(num>0)
		{
			r = num%10;
			num= num/10;
			
			sum = sum+(r*r*r);
			
		}
		if(temp==sum)
		{
			System.out.println("No is AmstrongNo");
		}
		else 
		{
			System.out.println("No is not aAmstrongNo");
		}

	}

}
