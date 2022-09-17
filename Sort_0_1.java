import java.util.*;
public class Sort_0_1 {
    /* You have been given an integer array(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array.
     Think of a solution which scans the array only once and don't require use of an extra array. */
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static void sortZeroesAndOne(int[] arr) {
    	int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<count)
            	arr[i]=0;
            else
                arr[i]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            sortZeroesAndOne(input);
            printArray(input);

            t -= 1;
        }
    }
}
