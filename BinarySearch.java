import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		//Sorts the array
		Arrays.sort(ray);

		//Sets the top to the top values index, the middle to 0 and the bottom to 0
		int top = ray.length -1;
		int middle = 0;
		int bottom = 0;

		//While the number has not been found
		while(bottom <= top)
		{
			middle = (bottom + top) / 2;
			if(ray[middle] < item)
			{
				bottom = middle + 1;
			}
			else if(ray[middle] > item)
			{
				top = middle - 1;
			}
			else
			{
				return middle;
			}
		}
		//If the number went through loop and was never found
		return -1;

	}
}
