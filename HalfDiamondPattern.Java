import java.util.*;
public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
        for(int i=1;i<=n+1;i++){
            System.out.print("*");
            int a=0;
            for(int j=1;j<i;j++){
                System.out.print(j);
                a=j;
            }
             for(int j=2;j<i;j++){
                System.out.print(a-1);
                a--;
            }
            if(i>1)
                System.out.print("*");
            System.out.println();
        }
         for(int i=1;i<=n;i++){
            System.out.print("*");
            int a=0;
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
                a=j;
            }
             for(int j=2;j<=n-i;j++){
                System.out.print(a-1);
                a--;
            }
            if(i<n)
                System.out.print("*");
            System.out.println();
        }
    }
        else{
            System.out.println("*");
            System.out.print("*");
        }
    }
}
