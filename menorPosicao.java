/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args) {
        int [] vetor={1,55,-33,27,5,53,43,88,19,10};
        int tamanho = sc.nextInt();
        int max = [0];
        int min = [0];
        for(int i = 0; i < vetor.length; i++){
            num = sc.nextInt();
            if(vetor[i] > max){
                max= vetor[i];
            }else if(vetor[i] < min){
                max= vetor[i];
            }
        }
        System.out.println("Max" +max);
        System.out.println("\n");
        System.out.println("Min" +min);
       
 
    }

}