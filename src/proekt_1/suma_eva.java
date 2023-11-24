package proekt_1;
import java.util.Scanner;
public class suma_eva {

	public static void main(String[] args) {
		int a,b,c,d,e;
		int sumap=0, sumanep=0;
		
		
		Scanner tastatura=new Scanner (System.in);
		
        System.out.println("Vnesete go prviot broj: ");
        a=tastatura.nextInt();
        
        System.out.println("Vnesete go vtoriot broj: ");
        b=tastatura.nextInt();
        
        System.out.println("Vnesete go tretiot broj: ");
        c=tastatura.nextInt();
        
        System.out.println("Vnesete go cetvrtiot broj: ");
        d=tastatura.nextInt();
        
        System.out.println("Vnesete go petiot broj: ");
        e=tastatura.nextInt();
        
        if (a%2==0) {
        	sumap=sumap+a;
        }else {
        	sumap=sumanep+a;
        	
            if (b%2==0) {
            	sumap=sumap+b;
            }else {
            	sumap=sumanep+b;
            	
                if (c%2==0) {
                	sumap=sumap+c;
                }else {
                	sumap=sumanep+a;
                	
                    if (d%2==0) {
                    	sumap=sumap+d;
                    }else {
                    	sumap=sumanep+d;
                    	
                        if (e%2==0) {
                        	sumap=sumap+a;
                        }else {
                        	sumap=sumanep+a;
        }
                    }
	}}}}}
