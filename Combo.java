public class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        if (tipo == 1) {
            sanduiche = new Sanduiche("Combo Master");
            sobremesa = new Sobremesa("Sorvete");
            bebida = new Bebida("Refrigerante");
        } else if (tipo == 2) {
            sanduiche = new Sanduiche("Super Combo");
            sobremesa = new Sobremesa("Torta");
            bebida = new Bebida("Suco");
        }
    }

    public void mostrarItensDoCombo() {
        System.out.println("Itens do Combo:");
        System.out.println("Sanduíche: " + sanduiche.getNome());
        System.out.println("Sobremesa: " + sobremesa.getNome());
        System.out.println("Bebida: " + bebida.getNome());
    }

    @Override
    public String toString() {
        return "Combo{" +
                "sanduiche=" + sanduiche.getNome() +
                ", sobremesa=" + sobremesa.getNome() +
                ", bebida=" + bebida.getNome() +
                '}';
    }
}
