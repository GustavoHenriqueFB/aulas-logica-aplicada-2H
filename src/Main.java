public class Main {
    public static void main(String[] args) {
 // Aula introdutória de Orientação à Objetos
        // Declaração de objeto
        Pessoa adao;
        // Instanciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new  Pessoa();
 // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));

        //Criar meus objetos
        //comportamento

        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definição do comportamento
        rainha.falar();
        rainha.comer();

// p2.preco = 233.00;
        p2.setPreco(233.00);
        Produto p3;
        p3 = new Produto("Placa Vídeo", 1300.00);
        p3 = new Produto("Placa mãe", 2500.00);

 p2.setPreco(1.00);
    }
}