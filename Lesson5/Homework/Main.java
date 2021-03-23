package Lesson5.Homework;

public class Main {
    public static void main(String[] args) {
        Passenger car1 = new Passenger(100,235,2.3,"Audi",4,3.6,"седан",5);
        car1.printInformation();
        car1.calculateDistance(2.5);

        Cargo cargo1 = new Cargo(380,185,3150.8,"ЗиЛ",4,6.3,3.8);
        cargo1.printInformation();
        cargo1.load(1.5);
        cargo1.load(4.1);

        Civil plane1 = new Civil(1100,880,6800,"Airbus",17,668,38,true);
        plane1.printInformation();
        plane1.load(15);
        plane1.load(43);

        Military plane2 = new Military(1300,1100,4500,"МиГ",11,280,2,true);
        plane2.printInformation();
        plane2.fire();
        plane2.fire();
        plane2.fire();
        plane2.fire();
        plane2.catapult();

        Military plane3 = new Military(1300,1100,4500,"МиГ",11,280,0,false);
        plane3.fire();
        plane3.catapult();
    }
}
