/*Longest Subarray with given Sum K(Positives)

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.


*/
import java.util.Scanner;
import java.util.Arrays;
class longestSubarray{
public static int subarray(int arr[],int n, int k){
  int length=0; 
for(int i=0;i<n;i++)
{
int sum=0;
for(int j=i;j<n;j++)
{
sum = sum + arr[j];

if(sum == k){
length =Math.max(length,j-i+1);
}
}
}
return length;
}

public static void main(String []args)
{

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=scanner.nextInt();
		System.out.println("enter the value of x:");
                 
		int arr[]=new int[n];
		System.out.println("enter the elements of an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
                 System.out.println("Enter the k value");
                int k=scanner.nextInt();
        int length=subarray(arr,n,k);

System.out.println("the length of the longest subarray is:" + length);
                          
}
}
/*
Time Complexity: O(N2) approx., where N = size of the array.
Reason: We are using two nested loops, each running approximately N times.

Space Complexity: O(1) as we are not using any extra space
*/