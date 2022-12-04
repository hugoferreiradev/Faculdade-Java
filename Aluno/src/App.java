public class App {
    public static void main(String[] args) throws Exception {
        ListaSequencial lista = new ListaSequencial();

        Aluno aluno = new Aluno("João", 5);
        lista.inserirAluno(aluno, 5);
        lista.mostra();

        System.out.println(lista.retornarValor(5));
    }
}
