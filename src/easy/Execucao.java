package easy;

import medium.Exercicio01;

public class Execucao {
    public static void main(String[] args) {
        String resultado1 = Exercicio02.exercicio2("gaby");
        System.out.println(resultado1); 

        String resultado2 = Exercicio02.exercicio2("qualidade");
        System.out.println(resultado2);

        String resultado3 = Exercicio01.eh_primo(15);
        System.out.println(resultado3);

        Exercicio04 exercicio04 = new Exercicio04();
        System.out.println(exercicio04.exercicio4(10));

        Exercicio06 exercicio06 = new Exercicio06();
        System.out.println(exercicio06.verificarAprovacao(5, 5));

        Exercicio07 exercicio07 = new Exercicio07(); 
        System.out.println("O Inss a ser pago será: "+exercicio07.calcularInss(1045.00));

        



       
    }
    
}
