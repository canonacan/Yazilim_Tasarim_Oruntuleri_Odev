package oyun;

public class OyunNesnesi {

    private String tur;
    private int can;
    private int hasar;

    private SaldiriStratejisi saldiriStratejisi;

    public OyunNesnesi(String tur, int can, int hasar) {
        this.tur = tur;
        this.can = can;
        this.hasar = hasar;
    }

    public void setSaldiriStratejisi(SaldiriStratejisi saldiriStratejisi) {
        this.saldiriStratejisi = saldiriStratejisi;
    }

    public void bilgiGoster() {
        System.out.println("Tur: " + tur);
        System.out.println("Can: " + can);
        System.out.println("Hasar: " + hasar);
    }

    public void saldir() {

        if (saldiriStratejisi != null) {
            saldiriStratejisi.saldir(tur);
        }
        else {
            System.out.println("Saldiri stratejisi bulunamadi!");
        }
    }
}