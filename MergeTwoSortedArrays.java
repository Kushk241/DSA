import java.util.*;
public class MergeTwoSortedArrays {
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
    public static int[] merge(int arr1[], int arr2[]) {
        int a=arr1.length, b=arr2.length,c=a+b,i=0,j=0,k=0;
        int[] arr3=new int[c];
    	for(;i<a||j<b;){
            if(j==b&&i<a){
                while(i<a){
                    arr3[k]=arr1[i];
                    i++;
                    k++;
                }
            }
            else if(i==a&&j<b){
                while(j<b){
                    arr3[k]=arr2[j];
                    j++;
                    k++;
                }
            }
            else if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = merge(input1, input2);
            printArray(ans);

            t -= 1;
        }
    }
}
