import java.util.*;
public class OddSquare
 {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n;i++){
            int sum=i,count=0;
            if(i%2==1){
                for(int j=1;j<=n;j++){
                    if(sum<2*n){
                    System.out.print(sum);
                    sum+=2;
                    }
                    else{
                        if(count<1){
                            sum=1;
                        }
                        System.out.print(sum);
                        sum+=2;
                    
                    }
                }
                 System.out.println();
            }
            else
                continue;
            
        }
	}
}
