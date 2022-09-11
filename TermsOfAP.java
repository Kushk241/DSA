import java.util.*;
public class TermsOfAP {
    // in this terms of AP which are divisible by 4 are excluded
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt(),i=1,sum=0,count=0;
    // int n=sc.nextInt(),sum=0,a=1;
    // for(int i=1;i<=n;i++){
    //     sum=3*a+2;
    //     if(sum%4==0){
    //         a++;
    //         sum=3*a+2;
    //     }
    //     System.out.print(sum+" ");
    //     a++;
    // }
    while(count<n){
        sum=3*i+2;
        if(sum%4==0){
            i++;
            continue;
        }
        System.out.print(sum+" ");
        i++;
        count++;
    } 
}
}
