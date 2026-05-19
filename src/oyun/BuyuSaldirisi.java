package oyun;

public class BuyuSaldirisi implements SaldiriStratejisi {

    @Override
    public void saldir(String tur) {
        System.out.println(tur + " buyu ile saldirdi!");
    }
}