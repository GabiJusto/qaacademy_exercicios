package medium;

public class Exercicio04 {

    public void multiplicaAteMil(){
        int i = 1, multi = 1; 

        while (i <= 1000) {
            multi = i * multi;
            if (multi >= 1000) {
                multi = 1;
            }
            System.out.println(multi);
            i++;
        }

    }

}