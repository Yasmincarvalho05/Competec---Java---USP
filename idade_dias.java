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
	    Scanner sc = new Scanner (System.in);
	    int soma = 0;
        int dias=sc.nextInt();
        int anos = dias /365;
        dias = dias % 365;
        int mes = dias / 30;
        dias = dias % 30;
        System.out.println( anos + " ano(s)");
         System.out.println( mes + " mes(es)");
          System.out.println( dias + " dia(s)");
        
       
        
        
        
	  
	}
}
