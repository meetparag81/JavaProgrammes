package JavaProgrammesIn;

public class Pallidrom {

	public static void main(String[] args) 
	{
		int num= 121;
		int temp=0;
		int sum = 0;
		int r=0;
		temp=num;
		while(num>0)
		{
			r=num%10;// take reminder out of the number
			
			sum = (sum*10)+r;// multiply sum by 10
			num = num/10;
			
		}
		
		
		if(sum==temp)
		{
			System.out.println("No is Pallidrom");
		}
		else
		{
			System.out.println("No is not Pallidrom");
		}

	}

}
