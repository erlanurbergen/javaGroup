package com.company.lesson14;

public class Main2 {
    public static void main(String[] args) {

        Body body = new Body();
        OilEngine oil = new OilEngine();
        Car<OilEngine> car = new Car(body, oil);
        System.out.println(car);


    }
}

class Car<T extends Engine> {

    // body
    // engine -> oilEngine -> electroEngine -> GasEngine
    // body

    private Body body;
    private T engine;

    public Car(Body body, T engine) {
        this.body = body;
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public T getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", engine=" + engine +
                '}';
    }
}

class Body {
    @Override
    public String toString() {
        return "Body{}";
    }
}

class Engine {
    @Override
    public String toString() {
        return "Engine{}";
    }
}

class OilEngine extends Engine{
    @Override
    public String toString() {
        return "OilEngine{}";
    }

    void drive() {
        System.out.println("oil engine is working very cool");
    }
}

class ElectroEngine extends Engine{
    @Override
    public String toString() {
        return "ElectroEngine{}";
    }
}

class GasEngine extends Engine{
    @Override
    public String toString() {
        return "GasEngine{}";
    }
}
