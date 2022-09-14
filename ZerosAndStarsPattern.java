import java.util.*;
public class ZerosAndStarsPattern {
    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i,c=1;
            for(int j=1;j<=2*n+1;j++){
                if(j==a&&c<=3){
                    System.out.print("*");
                    a+=n-i+1;
                    c++;
                    continue;
                }
                System.out.print("0");
            }
            System.out.println();
        }
		
	}	

}
