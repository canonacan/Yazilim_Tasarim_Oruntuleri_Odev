package oyun;

public class Main {

    public static void main(String[] args) {

        SavasLoglayici log =
                new SavasLoglayici();

        OyunNesnesi oyuncu =
                KarakterFabrikasi.olusturKarakter("oyuncu");

        oyuncu.setSaldiriStratejisi(
                new KilicSaldirisi());

        oyuncu.gozlemciEkle(log);

        OyunNesnesi goblin =
                KarakterFabrikasi.olusturKarakter("goblin");

        goblin.setSaldiriStratejisi(
                new OkSaldirisi());

        goblin.gozlemciEkle(log);

        oyuncu.bilgiGoster();
        oyuncu.saldir();

        System.out.println();

        goblin.bilgiGoster();
        goblin.saldir();
    }
}