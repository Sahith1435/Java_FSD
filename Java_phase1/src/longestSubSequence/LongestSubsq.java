package longestSubSequence;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class LongestSubsq {
	static int Index(int A[], int l, int r, int k)
    {
        while (r - l > 1) 
        {
            int m = l + (r - l) / 2;
            if (A[m] >= k)
            { r = m;}
            else
                {l = m;}
        }
 
        return r;
    }
 
static int LongestSubsqlgt(int A[], int size)
    {
        int[] Table = new int[size];
        int length;
        
        Table[0] = A[0];
        length = 1;
        
        for (int i = 1; i < size; i++) {
            if (A[i] < Table[0])
            	{Table[0] = A[i];}
 
            else if (A[i] > Table[length - 1])
            	{Table[length++] = A[i];}
 
            else
                {Table[Index(Table, -1, length - 1, A[i])] = A[i];}
        }
 
        return length;
    }

public static void main(String[] args)
    {
        int A[] = {50,3,10,7,40,80};
        int n = A.length;
        System.out.println("Length of Longest Increasing Subsequence is: " + LongestSubsqlgt(A, n));
    }

}
