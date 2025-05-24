/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número e receba a tabuada dele :)");
	    int numero=sc.nextInt();
	   for( int x = 0 ; x<=10 ; x++){
	       int resultado= numero*x;
	       	System.out.println("Resultado : " + resultado);
	   }
		
	}
}
