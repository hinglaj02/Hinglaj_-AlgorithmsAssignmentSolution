package sortimplimentation;

public class MergeSortImplementation1 {
	void merge(double[] notes, int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = notes[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = notes[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				notes[k] = leftArray[i];
				i++;
			} else {
				notes[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			notes[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			notes[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	public static void display(double[] notes)
	{
		int i;
		for( i = 0; i<notes.length; i++)
		{
		System.out.println(i+1 + " : "+ notes[i] + "  ");
		}
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(double[] price, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(price, left, mid);
			sort(price, mid + 1, right);

			// Merge the sorted halves
			merge(price, left, mid, right);
		}
		
	}
	public static void binarys(double arr[], double key, int last, int first)
	{
		

		int mid = (first+last)/2;
		 while(first <= last)
		 {
			 if(arr[mid]<key)
			 {
				 first = mid +1;
			 }
			 else if(arr[mid]==key)
			 {
				 System.out.println("Stock of value  " + key +" is present"); 
				 break;
			 }
			  
			 else
			 {
				 last = mid - 1;
			 }
			 mid = ( first + last)/2;
		 
		
		 if(first > last)
		 {
			 System.out.println("Stock of value  " + key +" is not present"); 
		 }
	}	
}}
