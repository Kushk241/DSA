import java.util.*;
public class CodeLinearSearch {
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
