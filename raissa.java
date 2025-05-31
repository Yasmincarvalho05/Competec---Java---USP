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
        
        int= notas;
        
        for (int i = 0; i < 10; i++) {
            notas(i) = sc.nextInt();
        }
        
        int soma = 0;
        for (int i = 1; i < 9; i++) {
            soma += notas[i];
        }

        double media = soma / 8.0;

        if (media > 900) {
            System.out.println("ÊEEEE CAMPEÃAAAA!!");
        } else {
            System.out.println("Fica pra próxima Fiel...");
        }

       
    }
}

