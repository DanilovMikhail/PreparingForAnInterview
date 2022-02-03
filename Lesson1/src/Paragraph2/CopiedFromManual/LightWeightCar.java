package Paragraph2.CopiedFromManual;

import com.sun.xml.internal.ws.api.pipe.Engine;

class LightWeightCar extends Car implements Moveable{

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
