package easy;

import javax.print.DocFlavor.STRING;

import medium.Exercicio01;

public class Execucao {
    public static void main(String[] args) {
        String resultado1 = Exercicio02.exercicio2("gaby");
        System.out.println(resultado1); 

        String resultado2 = Exercicio02.exercicio2("qualidade");
        System.out.println(resultado2);

        String resultado3 = Exercicio01.eh_primo(15);
        System.out.println(resultado3);
    }
    
}
