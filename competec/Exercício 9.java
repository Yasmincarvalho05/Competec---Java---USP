import java.util.Scanner;
public class Main
{
public static void main (String[] args) {
    
    int codigo_produto;
    Scanner ler= new Scanner (System.in);
    System.out.println("Digite o código do produto desejado");
    codigo_produto = ler.nextInt();
    System.out.printIn(codigo_produto);
    
    if (codigo_produto == 1){
        System.out.println(8.50);
    }else if (codigo_produto == 2){
        System.out.println(2.0);
    }else if (codigo_produto == 3){
        System.out.println(1.3);
    }else {
        System.out.println("Produto indisponível");
    }
    
    
  }  
}