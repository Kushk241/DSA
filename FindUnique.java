import java.util.*;
public class FindUnique {
    /*You have been given an integer array(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array.
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1 */
public static int[] takeInput(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt(); 
    }
    return arr;
}
public static int findUnique(int[] arr){
    for(int i=0;i<arr.length;i++){
        int c=0;
        for(int j=0;j<arr.length;j++){
            if(i==j)
                continue;
            if(arr[i]==arr[j]){
                c++;
            }
        }
        if(c==0)
             return arr[i];
    }
  
    return arr.length;
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(findUnique(input));

            t -= 1;
        }
}
}
