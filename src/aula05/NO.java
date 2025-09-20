package aula05;

public class NO<T> {
    private T elemento;
    private NO<T> proximo;
    
    public NO(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    
    public NO(T elemento, NO<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
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
        return "NO [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
}
