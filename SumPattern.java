import java.util.*;
public class SumPattern {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j<i)
                 System.out.print("+");
                else
                     System.out.print("=");
                sum+=j;
            }
            System.out.println(sum);
        }
	}
}
