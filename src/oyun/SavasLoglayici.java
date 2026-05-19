package oyun;

public class SavasLoglayici implements Gozlemci {
    @Override
    public void guncelle(String mesaj) {
        System.out.println("LOG: " + mesaj);
    }
    
}
