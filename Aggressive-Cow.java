import java.util.*;
import java.lang.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr= {1,2,4,8,9};
		int n = arr.length;
		int cow = 3;
		int low = arr[0];
		int high = arr[arr.length-1];
		
		while(low<=high){
			int mid = low+(high-low)/2;
			if(isPossible(arr, n, cow, mid)){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println("largest minimum distance is " + high);
	}
	static boolean isPossible(int[] arr, int n, int cow, int mid){
		int countcow = 1;
		int placedcow = arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]-placedcow>=mid){
				countcow++;
				placedcow = arr[i];
			}
		}
		if(countcow>=cow){
			return true;
		}
		return false;
	}
}
