import java.util.*;
public class Pattern4080922 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            int a=i;
            for(int j=1;j<=n;j++){
                    System.out.print(a+" ");
                    a+=5;
            }
            System.out.println();
        }   
    }
}
