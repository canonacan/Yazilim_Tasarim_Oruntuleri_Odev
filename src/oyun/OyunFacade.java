package oyun;

public class OyunFacade {

    public void karakteriCalistir(String tur, int can, int hasar) {

        OyunNesnesi karakter = new OyunNesnesi(tur, can, hasar);

        SavasSistemi savas = new MeleeAdapter(karakter);

        karakter.bilgiGoster();
        savas.saldir();

        System.out.println();
    }
}