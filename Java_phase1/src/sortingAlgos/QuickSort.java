package sortingAlgos;

public class QuickSort {
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++)
        { 
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
	
 void sort(int arr[], int small, int large)
    {
        if (small < large)
        {
        	int pi = partition(arr, small, large);
            
            sort(arr, small, pi-1);
            sort(arr, pi+1, large);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
public static void main(String args[])
    {
        int arr[] = {1,65,789,345,7};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("Array sorted in Quick Sort type is:"+ "");
        printArray(arr);
    }
}

