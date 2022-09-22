import java.util.*;
public class PushZerosToend {
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
    public static void pushZerosAtEnd(int[] arr) {
        int k=0;
    	for(int i=0;i<arr.length;i++){
           if(arr[i]!=0 && i==k){
               k++;           
           }
            else if(arr[i]!=0 && i!=k){
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
            else{
                continue;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            pushZerosAtEnd(input);
            printArray(input);

            t -= 1;
        }
    }
}
