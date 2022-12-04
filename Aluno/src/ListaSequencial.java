public class ListaSequencial {
    private Aluno[] vetor = new Aluno[10];
    private int totalElementos = 10;

    public void inserirAluno(Aluno aluno, int posicao) {
        if(posicao < tamanho()){
            vetor[posicao] = aluno;
        }
    }

    public void adicionar(Aluno valor) {
        garantirEspaço();
        vetor[totalElementos] = valor;
        totalElementos++;
    }

    public void garantirEspaço() {
        if (totalElementos == vetor.length) {
            Aluno[] novoVetor = new Aluno[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];

            }
            vetor = novoVetor;
        }
    }

    public int tamanho() {
        return totalElementos;
    }

    public Aluno retornarValor(int posicao) {
        if (posicao < tamanho()) {
            return vetor[posicao];
        } else {
            System.out.println("Posição maior que o tamanho do vetor");
            return null;
        }
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < tamanho(); i++) {
            if (aluno.equals(vetor[i])) {
                return true;
            }
        }
        return false;
    }

    public void remove(int posicao) {
        for (int i = 0; i < tamanho(); i++) {
            vetor[i] = vetor[i + 1];
        }
        totalElementos--;
    }
    public Aluno buscarPorNome(String nome){
        for(int i = 0; i < tamanho(); i++) {
            if(nome.equals(vetor[i].getNome())){
                return vetor[i];
            }
        }
        return null;
    }
    public void mostra(){
        for(int i = 0; i < tamanho(); i++) {
            System.out.println(vetor[i]
            + " , ");
        }
        System.out.println();
    }
}
