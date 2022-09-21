import java.util.*;
public class SearchInsertPosition {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static int searchInsert(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(m-s==1 && (nums[s]<target && nums[m]>target))
                return m;
            else if(nums[s]>target)
                return s;
            else if(nums[e]<target)
                return e+1;
            if(nums[m]>target)
                e=m-1;
            else if(nums[m]<target)
                s=m+1;
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
            System.out.println(searchInsert(input, x));

            t -= 1;
        }
    }
}
