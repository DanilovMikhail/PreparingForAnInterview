package Paragraph2.New;

import Paragraph2.CopiedFromManual.Moveable;

class LightWeightCar extends Car {

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
