import java.util.*;
public class SquareRoot {
    //Given a number N, find its square root. You need to find and print only the integral part of square root of N.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt(),i=0;
       while(i<=n){
           int a=i*i;
           if(a==n){
               System.out.println(i);
               break;
           }
           else if(a>n){
               System.out.println(--i);
               break;
           }
           else{
               i++;
           }
       }
       // int n=sc.nextInt(),a;
       // a=(int)Math.sqrt(n);
       // System.out.println(a);

   }
}
