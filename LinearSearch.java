import java.util.*;
public class LinearSearch {
/*The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array.
Second line contains 'N' single space separated integers representing the elements in the array.
Third line contains the value of X(integer to be searched in the given array) */
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int linearSearch(int arr[], int x) {
		for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int[] input = takeInput();
            int val=sc.nextInt();
            System.out.println(linearSearch(input, val));
            t -= 1;
        }
    
    }
    
}
