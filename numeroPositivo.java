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
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Digite um número inteiro positivo:");
	    int tamanho = sc.nextInt();
	    int n[] = new int [tamanho];
	    for(int i=0; i<n.length; i++){
	        n[i]=sc.nextInt();
	    }
	     for(int i:n ){
	         System.out.println(i);
	     }
	    
	
	}
}
