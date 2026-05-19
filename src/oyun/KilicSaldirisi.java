package oyun;

public class KilicSaldirisi implements SaldiriStratejisi {

    @Override
    public void saldir(String tur) {
        System.out.println(tur + " kilic ile saldirdi!");
    }
}