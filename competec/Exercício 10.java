/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int escolha_gatinho;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número da escolha do seu gatinho:");
        escolha_gatinho = ler.nextInt();
        System.out.println("Número escolhido: " + escolha_gatinho);
        
        if (escolha_gatinho == 1) {
            System.out.println("Ruivinho");
        } else if (escolha_gatinho == 2) {
            System.out.println("Mel");
        } else if (escolha_gatinho == 3) {
            System.out.println("Fofinn");
        } else if (escolha_gatinho == 4) {
            System.out.println("Pennyyy");
        } else if (escolha_gatinho == 5) {
            System.out.println("GaTINN");
        } else if (escolha_gatinho == 6) {
            System.out.println("Estrelo");
        } else if (escolha_gatinho == 7) {
            System.out.println("Tyler");
        } else {
            System.out.println("Gatinho indisponível :(");
        }
        
        ler.close(); 
    }
}
