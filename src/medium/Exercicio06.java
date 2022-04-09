package medium;


public class Exercicio06 {

    private int i;

    public int calculaFatorial(int fatorial) {

        i = fatorial;
        while (i > 1) {
            fatorial = fatorial * (i-1);
            i--;
        }
       return fatorial;
    }

}



