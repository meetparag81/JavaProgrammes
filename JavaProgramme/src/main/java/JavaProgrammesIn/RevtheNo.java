package JavaProgrammesIn;

public class RevtheNo {

	public static void main(String[] args) 
	{
		int num =121;
		int sum=0;
		int r = 0;
		
		while(num>0)
		{
			r = num%10;// 1 wiil be reminder for first iteration.
			sum = sum*10 + r;// sum is 1 for first ieration.
			num = num/10;// num will be 12 for firsr iteration.
			
		}
		System.out.println(sum);

	}

}
