package oyun;

import java.util.ArrayList;

public class OyunNesnesi {

    private String tur;
    private int can;
    private int hasar;

    private SaldiriStratejisi saldiriStratejisi;

    private ArrayList<Gozlemci> gozlemciler =new ArrayList<>();

    public OyunNesnesi(String tur, int can, int hasar) {

        this.tur = tur;
        this.can = can;
        this.hasar = hasar;
    }

    public void setSaldiriStratejisi(SaldiriStratejisi saldiriStratejisi) {

        this.saldiriStratejisi = saldiriStratejisi;
    }

    public void gozlemciEkle(Gozlemci gozlemci) {

        gozlemciler.add(gozlemci);
    }

    public void bildirimGonder(String mesaj) {

        for (Gozlemci gozlemci : gozlemciler) {

            gozlemci.guncelle(mesaj);
        }
    }

    public void bilgiGoster() {

        System.out.println("Tur: " + tur);
        System.out.println("Can: " + can);
        System.out.println("Hasar: " + hasar);
    }

    public void saldir() {

        if (saldiriStratejisi != null) {

            saldiriStratejisi.saldir(tur);

            bildirimGonder(tur + " saldiri yapti");
        }
        else {

            System.out.println("Saldiri stratejisi bulunamadi!");
        }
    }
}