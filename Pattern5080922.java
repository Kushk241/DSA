import java.util.*;
public class Pattern5080922 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int b;
        for(int i=n;i>=1;i--){
            a=i;
            b=n-i+1;
            for(int j=1;j<=n;j++){
                if(j%2==1){
                    System.out.print(a+" ");
                }
                else{
                    System.out.print(b+" ");
                }
                    a+=n;
                    b+=n;
            }
            System.out.println();
        }   
    }
}
