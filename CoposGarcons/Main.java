public class Main {
    public static void main(String[] args) {
        // Criação de copos para o primeiro garçom
        Copos[] coposGarcom1 = {
            new Copos("Gin", 20, true),
            new Copos("Rum", 22.5, true),
            new Copos("Cerveja", 10, true),
            new Copos("Whisky", 25, true)
        };
        Funcionario garcom1 = new Funcionario("Carlos", 1, coposGarcom1);
        garcom1.servirPedido();

        // Criação de copos para o segundo garçom
        Copos[] coposGarcom2 = {
            new Copos("Vodka", 18, true),
            new Copos("Tequila", 30, true),
            new Copos("Cerveja", 10, false),  // Um copo está vazio
            new Copos("Whisky", 25, true)
        };
        Funcionario garcom2 = new Funcionario("Paulo", 2, coposGarcom2);
        garcom2.servirPedido();
    }
}
