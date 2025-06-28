/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class equalsBatata
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String palavraSecreta = scan.nextLine();
	System.out.println(palavraSecreta.equals("BATATA"));
	System.out.println(palavraSecreta.equalsIgnoreCase("BATATA"));
	
	
	if(palavraSecreta.equalsIgnoreCase("BATATA") ){
	    System.out.println("Parabéns, você acertou!");
	}
	else {
	    System.out.println ("Que pena, você errou!");
	}
	

	}
}
