package aula06;

public class NoDuplo {
    public String dado;
    public NoDuplo proximo;
    public NoDuplo anterior;

    public NoDuplo() {
    }

    public NoDuplo(String dado) {
        this.dado = dado;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

}
