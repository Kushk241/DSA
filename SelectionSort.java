import java.util.*;
public class SelectionSort {
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
    public static void selectionSort(int[] arr) {
    	for(int i=0;i<arr.length-1;i++){
            int a=0;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    a=j;
                }
            }
            arr[a]=arr[i];
            arr[i]=min;
        }
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            selectionSort(input);
            printArray(input);

            t -= 1;
        }
    }
}
