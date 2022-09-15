import java.util.*;
public class Pattern1_150922 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i;
            for(int j=1;j<=n;j++){
                if(a%2==0){
                    System.out.print("0 ");
                }
                else
                System.out.print("1 ");
                a++;
            }
            System.out.println();
        }
    }
}
