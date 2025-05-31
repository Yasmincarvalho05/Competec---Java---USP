/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de álbuns: ");
        int N = sc.nextInt(); 

        int albunsVirais = 0; 
        for (int i = 1; i <= N; i++) {
            int somaOuvintes = 0;

            System.out.println("Digite os ouvintes do álbum " + i + " para América, Europa, Ásia, África e Oceania:");
            
            for (int j = 0; j < 5; j++) {
                int ouvintes = sc.nextInt();
                somaOuvintes += ouvintes;
            }

            if (somaOuvintes > 100000) {
                albunsVirais++;
            }
        }

       
        
    }
}