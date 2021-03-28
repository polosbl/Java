package Lesson6.Homework.human;

import Lesson6.Homework.human.jackets.AdidasJacket;
import Lesson6.Homework.human.jackets.NikeJacket;
import Lesson6.Homework.human.jackets.PumaJacket;
import Lesson6.Homework.human.pants.AdidasPants;
import Lesson6.Homework.human.pants.NikePants;
import Lesson6.Homework.human.pants.PumaPants;
import Lesson6.Homework.human.shoes.AdidasShoes;
import Lesson6.Homework.human.shoes.NikeShoes;
import Lesson6.Homework.human.shoes.PumaShoes;

public class Main {
    public static void main(String[] args) {
        AdidasShoes adidasShoes = new AdidasShoes();
        AdidasJacket adidasJacket = new AdidasJacket();
        AdidasPants adidasPants = new AdidasPants();

        NikeShoes nikeShoes = new NikeShoes();
        NikeJacket nikeJacket = new NikeJacket();
        NikePants nikePants = new NikePants();

        PumaShoes pumaShoes = new PumaShoes();
        PumaJacket pumaJacket = new PumaJacket();
        PumaPants pumaPants = new PumaPants();

        Human human1 = new Human("Alex",adidasJacket,nikeShoes,pumaPants);

        human1.putOn();
        human1.takeOff();
    }
}
