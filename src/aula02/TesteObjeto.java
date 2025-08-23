package aula02;

public class TesteObjeto {
    public static void main(String[] args) throws Exception {
        VetorObject vObj = new VetorObject(5);
        Contato c1 = new Contato("Guiler", "1193939319", "guis@gmail.com");
        Contato c2 = new Contato("Bia", "213217312", "bia@gmail.com");
        Contato c3 = new Contato("Rafa", "12817231", "rafaS@gmail.com");

        vObj.adiciona(c1);
        vObj.adiciona(c2);
        vObj.adiciona(c3);
        
        System.out.println("Quantidade de dados do vetor: " + vObj.qtdItensPreenchido());
        System.out.println("Dados do Vetor: " + vObj.toString());
    }
}
