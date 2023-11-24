package proekt_1;
import java.util.Scanner;
public class Ciklusi {
	public static void main(String[] args) {
		double a,b,a1,b1;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("vnesi ja prvata strana");
		a = tastatura.nextDouble();
		System.out.println("vnesi ja vtorata strana");
		b = tastatura.nextDouble();
		a1=a;
		b1=b;
		while(a!=b) {
			if(a>b) {
			a=a-b;
			}else {
			b=b-a;
			}
			}
			double nzd=a;

			System.out.print("\n Nzd na broevite e: " + nzd );
			System.out.print("\n Skratenata dropka e: "+a1/nzd+" / "+b1/nzd);
			}
	}