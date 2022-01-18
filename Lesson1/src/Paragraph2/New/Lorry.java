package Paragraph2.New;

import Paragraph2.CopiedFromManual.Moveable;
import Paragraph2.CopiedFromManual.Stopable;

class Lorry extends Car {

    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

}
