public class Produto {
// Atributos
    double preco;
    String modelo;

    // Método construtor
    Produto(){}
    // sobrecarga do método construtor
    Produto(double preco){
this.preco = preco;
    }
    // Mais uma sobrecarga
Produto(String modelo,double preco) {
    this.modelo = modelo;
    this.preco = preco;

}
}

