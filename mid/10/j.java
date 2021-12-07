public class Counter
{

	private int counter = 0;

	public void setCounterToZero()
	{
		counter = 0;
	}

	public void addOneToCount()
	{
		counter = counter + 1;
	}

	public void subtractOneFromCount()
	{
		if (counter > 0)
		{
			counter = counter - 1;
		}
		else
		{
			System.out.println("Counter is zero. A negative counter is not allowed.");
		}
		
	}

	public int getCounter()
	{
		return counter;
	}

	public void outputCounterToScreen()
	{
		System.out.println("The counter's value is: " + counter);
	}
 }