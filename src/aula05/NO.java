package aula05;

public class NO<T> {
    private T elemento;
    private NO<T> proximo;
    private NO<T> anterior;

    public NO<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NO<T> antes) {
        this.anterior = antes;
    }

    public NO(T elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.proximo = null;
    }

    public NO(T elemento, NO<T> proximo, NO<T> anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NO<T> getProximo() {
        return proximo;
    }

    public void setProximo(NO<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "NO [elemento=" + elemento + ", proximo=" + proximo + ", anterior=" + anterior + "]";
    }

}
