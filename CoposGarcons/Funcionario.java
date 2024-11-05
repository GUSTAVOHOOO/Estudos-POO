
public class Funcionario {
    private String nome;
    private int numMesa;
    private Copos[] copos;

    public Funcionario(String nome, int numMesa, Copos[] copos) {
        this.nome = nome;
        this.numMesa = numMesa;
        this.copos = copos;
    }

    // Método para verificar se todos os copos estão cheios
    public boolean verificarCopos() {
        for (Copos copo : copos) {
            if (!copo.isCheio()) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular o valor total do pedido
    public double calcularValor() {
        double valorTotal = 0;
        for (Copos copo : copos) {
            valorTotal += copo.getValor();
        }
        return valorTotal;
    }

    // Método para servir o pedido
    public void servirPedido() {
        if (verificarCopos()) {
            System.out.printf("\nGarçom: %s, Mesa: %d, Valor do Pedido: %.2f\n", nome, numMesa, calcularValor());
        } else {
            System.out.println("\nPedido não pode ser servido, pois nem todos os copos estão cheios.");
        }
    }
}

