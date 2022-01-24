package Paragraph2.New;

import com.sun.xml.internal.ws.api.pipe.Engine;

abstract class Car {

    private Engine engine;
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    protected void open(){
        System.out.println("Car open");
    }

    protected void move(){
        System.out.println("Car move");
    }

    protected void stop(){
        System.out.println("Car stop");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
