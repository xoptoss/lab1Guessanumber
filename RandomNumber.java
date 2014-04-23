package mainPackage;

import java.util.Random;

public class RandomNumber {

	Random random = new Random();
	int answer;

	public int GetANumber()
	{
		answer = random.nextInt(9)+1;
		return answer;
	}

	public int GetANumber(int high)
	{
		answer = random.nextInt(high)+1;
		return answer;
	}

	public int GetANumber(int high, int low)
	{
		answer = random.nextInt(high-low)+low;
		return answer;
	}
}
