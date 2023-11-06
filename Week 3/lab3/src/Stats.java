import java.util.Arrays;

/**
 * Class that creates statistics using a few random numbers.
*/
public class Stats {
	int[] numbers;
	int number;

	/**
	 * Adds the value to the numbers array and it increments the amount of numbers.
	 * 
	 * @author Alexe Tataru
	 * @param value it is the number that is passed from the driver method.
	 */
	public void addValue(int value)
	{
		numbers[number] = value;
		number++;
	}

	/**
	 * It gets the length of the numbers array.
	 * 
	 * @return numbers.length it is the length of the numbers array
	*/
	public int getLength()
	{
		return numbers.length;
	}

	/**
	 * It gets the maximum number of the elements from the array.
	 * 
	 * @return max it is the maximum number from the numbers of the array
	*/
	public int getMax() {
		int maxNum = numbers[0];

		for (int number = 1; number < numbers.length; number++)
		{
			if (numbers[number] > maxNum)
			{
				maxNum = numbers[number];
				return maxNum;
			}
		}
		return 0;
	}

	/**
	 * It gets the minimum value of the numbers array
	 * 
	 * @return min it is the minimum value of the numbers array
	*/
	public int getMin() { 	//gets minimum value
		int minNum = numbers[0];

		for (int number = 1; number < numbers.length; number++)
		{
			if (numbers[number] < minNum)
			minNum = numbers[number];
		}
		return minNum;
	}
	
	/**
	 * It returns the sum of all the elements in the numbers array.
	 * 
	 * @return total the sum of all the elements in the numbers array
	*/
	public int getTotal() {
		int total = 0;
		
		// total all values within the array
		for (int number = 0; number < numbers.length; number++)
		{
			total += numbers[number];
		}
		return total;
	}
	
	/**
	 * It gets the average from adding all the numbers together and then
	 * dividing them by the number of values in the array.
	 * 
	 * @return average it returns the average that is calculated in the fuction.
	*/
	public double getAverage() {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) //goes through the numbers array
		{
			total += numbers[i];
		}
		double average = total/(double)numbers.length;
		
		return average;
	}

	/**
	 * It converts the numbers array to a string.
	 * It overrides the default toString method.
	 * 
	 * @return Arrays.toString(numbers) it returns the numbers array, but converted to a string array.
	*/
	@Override
	public String toString()
	{
		return Arrays.toString(numbers);
	}

	/**
	 * The constructor of the stats class.
	 * It creates the numbers array.
	 * 
	 * @param capacity it holds the number of elements in the array, when created.
	*/
	public Stats(int capacity)
	{
		numbers = new int[capacity];
	}
}
