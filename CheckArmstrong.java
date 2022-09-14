import java.util.*;
public class CheckArmstrong {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),temp=n,sum=0;
        int a=(int)Math.log10(n)+1;
        int[] digits=new int[a];
        boolean arm=true;
        for(int i=0;i<a;i++){
           digits[i]=temp%10;
            temp/=10;
        }
        for(int i=0;i<a;i++){
           sum+=(int)Math.pow(digits[i],a);
        }
        if(sum!=n){
            arm=false;
        }
        System.out.println(arm);

	}
}
