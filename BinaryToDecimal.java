import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),temp=n,dec=0,a=0;
        while(temp>0){
            int i=temp%10;
            dec+=i*Math.pow(2,a);
            a++;
            temp/=10;
        }
        System.out.println(dec);
        //Below is the second method
        // String bin=sc.next();
        // int dec=Integer.parseInt(bin,2);
        // System.out.println(dec);

	} 
}
