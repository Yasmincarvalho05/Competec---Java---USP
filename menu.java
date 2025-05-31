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
		System.out.println("1- Hamburguer");
		System.out.println("2- Batata frita");
		System.out.println("3- Sorvete");
		System.out.println("4- Suco");
		
		System.out.println("Qual o seu pedido? : ");
		
		int numero_do_pedido = sc.nextInt();
		
		System.out.println("Quantas unidades você gostaria? : ");
		int quantidade_de_pedidos = sc.nextInt();
		
		//MENU\\
		double hamburguer = 20.20;
		double batata_frita = 15.0;
		double sorvete = 4.0;
		double suco = 10.0;
		
		double minha_compra = 0.0 ;
		
		
		System.out.println("Insira seu saldo");
		double meu_saldo = sc.nextDouble();
		System.out.println("Seu saldo: " + meu_saldo);
		
		switch(numero_do_pedido){
		    case 1: minha_compra = hamburguer*quantidade_de_pedidos;
		    break;
		     case 2: minha_compra = batata_frita*quantidade_de_pedidos;
		    break;
		     case 3: minha_compra = sorvete*quantidade_de_pedidos;
		    break;
		     case 4: minha_compra = suco*quantidade_de_pedidos;
		    break;
		}
		if(minha_compra < meu_saldo){
		    System.out.println("Vai comer e sobrar dinheiro:");
		} else if(minha_compra == meu_saldo){
		    System.out.println("Vai comer, mais vai ficar sem saldo.");
		}else{
		    System.out.println("Não vai comer.");
		}
	}
}
