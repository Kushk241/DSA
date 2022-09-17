import java.util.*;
public class IntersectionOfTwoArrays {
    /* You have been given two integer arrays(ARR1 and ARR2) of size N and M, respectively.
     You need to print their intersection; An intersection for this problem can be defined
     when both the arrays contain a particular value or to put it in other words,
     when there is a common value that exists in both the arrays. */
     public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static void intersections(int arr1[], int arr2[]) {
        
    	for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            intersections(input1, input2);
            System.out.println();

            t -= 1;
        }
    }
}
