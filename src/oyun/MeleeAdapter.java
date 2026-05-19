package oyun;

public class MeleeAdapter implements SavasSistemi {

    private OyunNesnesi karakter;

    public MeleeAdapter(OyunNesnesi karakter) {
        this.karakter = karakter;
    }

    @Override
    public void saldir() {
        karakter.saldir();
    }
}