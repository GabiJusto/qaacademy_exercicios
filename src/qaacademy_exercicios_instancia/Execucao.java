package qaacademy_exercicios_instancia;

public class Execucao {
    public static void main(String[] args) {
        ExercicioInstancia objExercicioInstancia = new ExercicioInstancia();
        System.out.println(objExercicioInstancia.nome);
        System.out.println(objExercicioInstancia.profissao);
        objExercicioInstancia.exibirNome();
        objExercicioInstancia.exibirProfissao();
        System.out.println(objExercicioInstancia.exibirEmpresa("truckpad"));

    }

}
