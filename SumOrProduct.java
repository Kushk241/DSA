import java.util.*;
public class SumOrProduct {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(), C=sc.nextInt(),sum=0,p=1;
        if(C==1){
            for(int i=1;i<=N;i++)
            {
                sum+=i;
            } 
            System.out.println(sum);
        }
        else if(C==2){
            for(int i=1;i<=N;i++)
            {
                p*=i;
            } 
            System.out.println(p);
        }
        else
            System.out.println("-1");

	}
}

