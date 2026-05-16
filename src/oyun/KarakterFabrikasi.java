package oyun;

public class KarakterFabrikasi {

    public static OyunNesnesi olusturKarakter(String tur) {

        if(tur.equals("oyuncu")) {

            return new OyunNesnesi("oyuncu", 100, 20);

        }

        else if(tur.equals("goblin")) {

            return new OyunNesnesi("goblin", 50, 10);

        }

        else if(tur.equals("ork")) {

            return new OyunNesnesi("ork", 80, 15);

        }

        throw new IllegalArgumentException("Gecersiz karakter turu!");

    }

}