import java.util.*;
public class TripletSum {
    /* You have been given a random integer array(ARR) and a number X.
     Find and return the number of triplets in the array which sum to X. */
     public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int findTriplet(int[] arr, int x) {
    	int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==x)
                    count++;
                }
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
            System.out.println(findTriplet(input,x));

            t -= 1;
        }
    }
}
