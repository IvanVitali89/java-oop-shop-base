public class ProvaProdotto {
    public static void main(String[] args) {
        Prodotto Negozio = new Prodotto("Latte", "Caro", 50, 7);

        System.out.println(Negozio.PrezzoBase());
        System.out.println(Negozio.PrezzoIva());
        System.out.println(Negozio.NomeEsteso());
    }
}
