import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),temp=n;
		String s="";
		if(n==0){
		s="0";
		}
		while(temp>0){
		int i=temp%2;
		s+=i;
		temp/=2;       
		}
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		s=sb.toString();
		System.out.println(s);
        //Below is the second method
        // int n=sc.nextInt();
        // System.out.println(Integer.toBinaryString(n));

	}
}
