package Lesson6.Homework.human;

import Lesson6.Homework.human.jackets.IJacket;
import Lesson6.Homework.human.pants.IPants;
import Lesson6.Homework.human.shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private IPants pants;

    public Human () {
    }

    public Human (String name,IJacket jacket,IShoes shoes,IPants pants) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void putOn() {
        jacket.putOn();
        shoes.putOn();
        pants.putOn();
    }

    public void takeOff() {
        jacket.takeOff();
        shoes.takeOff();
        pants.takeOff();
    }
}
