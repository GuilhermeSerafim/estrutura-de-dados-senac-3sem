package aula05;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> l = new ListaEncadeada<>();
        System.out.println("Tamanho da Lista = " + l.getTamanho());
        l.adiciona("Isabela");
        System.out.println("Tamanho da Lista = " + l.getTamanho());
        System.out.println("Início da Lista = " + l.getInicio().getElemento());
        System.out.println("Fim da Lista = " + l.getFim().getElemento());
        
        l.adiciona("Guilherme");
        System.out.println("Tamanho da Lista = " + l.getTamanho());
        System.out.println("Início da Lista = " + l.getInicio().getElemento());
        System.out.println("Fim da Lista = " + l.getFim().getElemento());
        
        l.adiciona("Aurora");
        System.out.println("Tamanho da Lista = " + l.getTamanho());
        System.out.println("Início da Lista = " + l.getInicio().getElemento());
        System.out.println("Fim da Lista = " + l.getFim().getElemento());
    }
}
