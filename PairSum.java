import java.util.*;
public class PairSum {
   /* You have been given an integer array(ARR) and a number X.
    Find and return the total number of pairs in the array which sum to X. */ 
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int pairSum(int arr[], int x) {
    	int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            int x=sc.nextInt();
            System.out.println(pairSum(input,x));

            t -= 1;
        }
    }
}
