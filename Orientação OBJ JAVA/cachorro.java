/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class cachorro {
    
    private int idade;
    private double peso;
    
    public double getPeso(){
        return peso;
    }
    
    public boolean setIdade(int idade){
        if(idade <0 || idade > 20)
        return false;
        
        this.idade = idade;
        return true;
    }
}
