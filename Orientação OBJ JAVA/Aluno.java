/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Aluno{
    private String nome;
    private double N1;
    private double N2;
    public double media;
    
    
    public Aluno(String nome, double N1, double N2){
        this.nome = nome;
        this.media= (N1+N2)/2;
        this.N1 = N1;
        this.N2 = N2;
    }
    
     public double getMedia(){
    return media;
    }
    
}
