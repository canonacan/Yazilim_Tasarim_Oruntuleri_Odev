package oyun;

public class Main {

    public static void main(String[] args) {

        OyunNesnesi oyuncu =
        KarakterFabrikasi.olusturKarakter("oyuncu");

        OyunNesnesi goblin =
        KarakterFabrikasi.olusturKarakter("goblin");

        oyuncu.bilgiGoster();
        oyuncu.saldir();

        System.out.println();

        goblin.bilgiGoster();
        goblin.saldir();

    }

}