/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class SistemaAcademico {

    private NoAluno raiz;
    private int tamanho;

    public SistemaAcademico() {
        raiz = null;
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void insere(int matricula, String nome, String curso, double coeficiente) {
        NoAluno da_vez = this.raiz;

        if (da_vez == null) {
            this.raiz = new NoAluno(matricula, nome, curso, coeficiente, null);
            tamanho++;
            return;
        }

        NoAluno pai;

        do {
            pai = da_vez;
            if (matricula < da_vez.getMatricula()) {
                da_vez = da_vez.getEsquerda();
            } else if (matricula > da_vez.getMatricula()) {
                da_vez = da_vez.getDireita();
            } else {
                return;
            }
        } while (da_vez != null);

        NoAluno candidato = new NoAluno(matricula, nome, curso, coeficiente, pai);

        if (matricula < pai.getMatricula()) {
            pai.setEsquerda(candidato);
        } else {
            pai.setDireita(candidato);
        }

        this.tamanho++;
    }

    public NoAluno busca(int chave) {
        NoAluno noAtual = raiz;

        while (noAtual != null && noAtual.getMatricula() != chave) {
            if (chave < noAtual.getMatricula()) {
                noAtual = noAtual.getEsquerda();
            } else {
                noAtual = noAtual.getDireita();
            }
        }

        return noAtual;
    }

    public void caminhaCentral() {
        this.caminhaCentral(this.raiz);
    }

    public void caminhaCentral(NoAluno subArvore) {
        if (subArvore != null) {
            caminhaCentral(subArvore.getEsquerda());
            System.out.print(subArvore.getMatricula() + " ");
            caminhaCentral(subArvore.getDireita());
        }
    }
}
