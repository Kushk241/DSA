import java.util.*;
public class ReturnArraySum {
/* The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first line of each test case or query contains an integer 'N' representing the size of the array.
Second line contains 'N' single space separated integers representing the elements in the array.*/
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int sum(int[] arr) {
		int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int[] input = takeInput();
            System.out.println(sum(input));
            t -= 1;
    }
    
}
}
