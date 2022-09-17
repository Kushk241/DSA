import java.util.*;
public class FindDuplicate {
    /* You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once.
     That is, if N = 5, the array constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice.
     You need to find and return that duplicate number present in the array. */
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int duplicateNumber(int arr[]) {
    	for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j)
                    continue;
                if(arr[i]==arr[j]){
                    return arr[j];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(duplicateNumber(input));

            t -= 1;
        }
    }

}
