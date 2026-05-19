package oyun;

public class Main {

    public static void main(String[] args) {

        OyunNesnesi oyuncu = KarakterFabrikasi.olusturKarakter("oyuncu");

        oyuncu.setSaldiriStratejisi(new KilicSaldirisi());

        OyunNesnesi goblin = KarakterFabrikasi.olusturKarakter("goblin");

        goblin.setSaldiriStratejisi(new OkSaldirisi());

        oyuncu.bilgiGoster();
        oyuncu.saldir();

        System.out.println();

        goblin.bilgiGoster();
        goblin.saldir();
    }
}