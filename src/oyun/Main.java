package oyun;

public class Main {

    public static void main(String[] args) {

        OyunFacade oyun = new OyunFacade();

        oyun.karakteriCalistir("oyuncu", 100, 20);

        oyun.karakteriCalistir("goblin", 50, 10);
    }
}