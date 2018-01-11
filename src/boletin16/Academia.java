
package boletin16;

import com.luis.persoal.Persoal;


public class Academia {
    private static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal alum;

    public Academia() {
    }

    public Academia(String nome, int nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academia{" + "numReferencia=" + numReferencia + ", nome=" + nome + ", nota=" + nota + ", alum=" + alum + '}';
    }
    
}
