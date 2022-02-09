package arrayRotation;

public class ArrayRotation {
	public void rotate(int[] numbs, int k) 
	{
		if(k > numbs.length) 
   			k=k%numbs.length;
		
		int[] result = new int[numbs.length];
		
		for(int i=0; i < k; i++)
			{
    			result[i] = numbs[numbs.length-k+i];
			}
		
		int j=0;
		for(int i=k; i<numbs.length; i++)
		{
    			result[i] = numbs[j];
    			j++;
		}
		
		System.arraycopy( result, 0, numbs, 0, numbs.length );
}

public static void main(String[] args) {
	ArrayRotation r = new ArrayRotation();
    		int arr[] = { 6,3,4,5,9,10 }; 
    		r.rotate(arr, 5); 
    		for(int i=0;i<arr.length;i++){
        			System.out.print(arr[i]+" ");
    		}
}
}

