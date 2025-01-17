package naphtali_mason;

public class Exercises
{
	/**@author Mason Naphtali
	 *
	 */
	
	public static int threeAndFive()
	{
		int count = 0;
		for(int i = 0; i<=1000;i++)
		{
			if(i%3==0||i%5==0)
				count+=i;
		}
		return count;
	}
	
	public static int evenFibSum()
	{
		int count = 0;
		int prevFib = 1;
		int currentFib = 1;
		while(currentFib<=4000000)
		{
			if(currentFib%2==0)
				count+=currentFib;
			
			int temp= currentFib;
			currentFib+=prevFib;
			prevFib=temp;
		}
		return count;
	}
	
	public static int largestPrimeFactor()
	{
		int answer = -1;
		long currentNum = Long.parseLong("600851475143");
		boolean contFinalLoop = true;
		while(contFinalLoop)
		{
			int i = 1;
			boolean contNewNum=true;
			while(contNewNum)
			{
				i++;
				if(currentNum%i==0)
				{
					currentNum/=i;
					if(i>answer)
						answer=i;
					contNewNum=false;
				}
				else
				{
					if(i>=currentNum)
					{
						contNewNum=false;
						contFinalLoop = false;
					}
				}
				
			}
		}
		return answer;
	}
	
}
