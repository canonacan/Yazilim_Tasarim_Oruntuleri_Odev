package oyun;

public class OyunNesnesi {

    String tur;
    int can;
    int hasar;

    public OyunNesnesi(String tur, int can, int hasar) {

        this.tur = tur;
        this.can = can;
        this.hasar = hasar;

    }

    public void bilgiGoster() {

        System.out.println("Tur:" + tur);
        System.out.println("Can:" + can);
        System.out.println("Hasar:" + hasar);

    }

    public void saldir() {

        if(tur.equals("oyuncu")) {

            System.out.println("Oyuncu kilic ile saldirdi!");

        }

        else if(tur.equals("goblin")) {

            System.out.println("Goblin hançer ile saldirdi!");

        }

        else if(tur.equals("ork")) {

            System.out.println("Ork balta ile saldirdi!");

        }

    }

}