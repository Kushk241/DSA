import java.util.*;
public class SwapAlternate {
/*You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array.
Sample Input:
1
6
9 3 6 12 4 32
Sample Output:
3 9 12 6 32 4
*/
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
public static void swapAlternate(int arr[]) {
    for(int i=0;i<arr.length;i+=2){
        if(i+1<arr.length){
        int a=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=a;
        }
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            swapAlternate(input);
            printArray(input);

            t -= 1;
        }
}

    
}
