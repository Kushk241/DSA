import java.util.*;
public class Pattern2080922 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n;j++){
                if(j%2==1){
                System.out.print(a+" ");
                a++;
                }
                else{
                    System.out.print(i+" ");  
                }
            }
            
        } 
    }
}
