package Lesson6.Homework.cosmodrome;

import Lesson6.Homework.cosmodrome.spaceships.Shuttle;
import Lesson6.Homework.cosmodrome.spaceships.SpaceX;
import Lesson6.Homework.cosmodrome.spaceships.Vostok;

public class Main {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();

        Shuttle shuttle = new Shuttle();
        Vostok vostok = new Vostok();
        SpaceX spaceX = new SpaceX();

        cosmodrome.launch(shuttle);
        cosmodrome.launch(vostok);
        cosmodrome.launch(spaceX);
    }
}
