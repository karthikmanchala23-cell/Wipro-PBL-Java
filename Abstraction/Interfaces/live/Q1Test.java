package live;

import music.Q1Playable;
import music.string.Q1Veena;
import music.wind.Q1Saxophone;

public class Q1Test {

    public static void main(String[] args) {

        Q1Veena veena = new Q1Veena();
        veena.play();

        Q1Saxophone sax = new Q1Saxophone();
        sax.play();

        Q1Playable p;

        p = new Q1Veena();
        p.play();

        p = new Q1Saxophone();
        p.play();
    }
}