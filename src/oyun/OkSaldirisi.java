package oyun;

public class OkSaldirisi implements SaldiriStratejisi {

    @Override
    public void saldir(String tur) {
        System.out.println(tur + " ok ile saldirdi!");
    }
}