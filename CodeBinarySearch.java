import java.util.*;
public class CodeBinarySearch {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int binarySearch(int[] arr, int x) {
    	int s=0,e=arr.length-1,m=0;
        while(s<=e){
            m=(s+e)/2;
            if(arr[m]>x){
                e=m-1;
            }
            else if(arr[m]<x){
                s=m+1;
            } 
            else
                return m;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int[] input = takeInput();

        while(t > 0) {
            int x=sc.nextInt();
            System.out.println(binarySearch(input, x));

            t -= 1;
        }
    }
}
