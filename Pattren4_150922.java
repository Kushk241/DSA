import java.util.*;
public class Pattren4_150922 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0;
        for(int i=1;i<=n;i++){
            a+=i;
            for(int j=a;j>a-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
