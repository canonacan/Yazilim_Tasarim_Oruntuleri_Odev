package oyun;

public class Main {

    public static void main(String[] args) {

        OyunNesnesi oyuncu = new OyunNesnesi("oyuncu", 100, 20);

        OyunNesnesi goblin = new OyunNesnesi("goblin", 50, 10);

        oyuncu.bilgiGoster();
        oyuncu.saldir();

        System.out.println();

        goblin.bilgiGoster();
        goblin.saldir();

    }

}
