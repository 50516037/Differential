package differential;

import java.util.Scanner;
/**
 *  @author 50516037
 * h=0.00000000536~0.00000000537
 */
public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.print("Input value of a>"); 
 		double a = Double.parseDouble(scan.next()); 
		System.out.print("Input value of h>"); 
 		double h = Double.parseDouble(scan.next());
	
	Differential_lib dlib = new Differential_lib(a,h);
	System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.GetRx());
	System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.GetDx());
	System.out.println("相対誤差は"+dlib.GetAx());
	
	}
}
