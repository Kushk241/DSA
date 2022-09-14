import java.util.*;
public class FibonacciNumber {
    //Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
    public static boolean checkMember(int n){
		int a=0,b=1;
        boolean d=true;
        while(b<=n){
        int c=a+b;
        a=b;
        b=c;
        if(c==n){
            d=true;
            break;
        }
            else{
                d=false;
            }
        }
        return d;
		
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));
    }
}
