import java.util.*;
public class CheckNumberSequence {
    //Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=true;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(a[i]==a[j]){
                    b=false;
                }
            }
        }
        System.out.println(b);
	}
}
