import java.util.*;
public class FahrenheitToCelsiusTable {
    //Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
    public static void printFahrenheitTable(int start, int end, int step) {
		for(int i=start;i<=end;i+=step){
            int cel = (i-32)*5/9;
           System.out.printf("%d\t%d",i,cel);
            System.out.println();
        }
		
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);
	}
}
