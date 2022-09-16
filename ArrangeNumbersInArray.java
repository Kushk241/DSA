import java.util.*;
public class ArrangeNumbersInArray {
    /*You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first and the only line of each test case or query contains an integer 'N'. */
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

        public static void arrange(int[] arr, int n) {
            int a=1,b=n;
            for(int i=0;i<n;i++){
                if(a<n){
                    arr[i]=a;
                    a+=2;
                }
                else{
                    arr[i]=b;
                    if(b%2==1){
                        b--;
                        continue;
                    }
                    b-=2;
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            arrange(arr, n);
            printArray(arr);

            t -= 1;
        } 
    }
}
