import java.util.Random;

public class Prodotto {
    Random ran = new Random();
    int codice = ran.nextInt(50);

    String nome;
    String descrizione;
    int prezzo;
    int iva;

    public Prodotto(String nome, String descrizione, int prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int PrezzoBase() {
        return prezzo;
    }

    public int PrezzoIva() {
        return prezzo + iva;
    }

    public String NomeEsteso() {
        return codice +"-"+ nome;
    }

}
