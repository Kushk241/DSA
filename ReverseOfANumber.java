import java.util.*;
public class ReverseOfANumber {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),temp=n,rev=0;
        while(temp>0){
            int i=temp%10;
            rev=rev*10+i;
            temp/=10;
        }
        System.out.println(rev);
	}
}
