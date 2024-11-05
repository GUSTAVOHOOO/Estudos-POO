public class Copos {
    private String tipoBebida;
    private double valor;
    private boolean cheio;

    public Copos(String tipoBebida, double valor, boolean cheio) {
        this.tipoBebida = tipoBebida;
        this.valor = valor;
        this.cheio = cheio;
    }

    public double getValor() {
        return valor;
    }

    public boolean isCheio() {
        return cheio;
    }

    public void encher() {
        this.cheio = true;
    }
}
