package com.company.lesson10;

public class Test {
    public static void main(String[] args) {
        // Абстрактные классы и интерфейсы
        /*Задание 1
        Создайте абстрактный класс Engine с параметрами:
        - double engineVolume;
        - int cylinderAmount;
        - double engineWeight;
        Конструкторы с параметрами и конструктор по умолчанию Геттеры и сеттеры
        + abstract double efficiency();
        + abstract double throttleEnergy();
        + abstract double breakEnergy();
        + double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
        }
        Создайте класс FerrariEngine которая наследует от класса Engine. Конструкторы с параметрами и конструктор по умолчанию Реализуйте все абстрактные методы
        В FerrariEngine вы вычислите абстрактные методы по формуле:
        Efficiency: 0.25
        Throttle energy: engineVolume*cylinderAmount*100
        Break energy: engineWeight*2
        Создайте класс RenaultEnigine которая наследует от класса Engine.
        - double extraTurboEnergy;
        Конструкторы с параметрами и конструктор по умолчанию Реализуйте все абстрактные методы
        В RenaultEnigine вы вычислите абстрактные методы по формуле: Efficiency: 0.27
        Throttle energy: engineVolume*cylinderAmount*110 + extraTurboEnergy Break energy: engineWeight*2.1
        В основном классе Main, создайте 10 объектов класса FerrariEngine и RenaultEnigine с разными значениями.
        Добавьте все в массив класса Engine.
        Выведите максимальные скорости каждого объекта*/

        /*Задание 1
        Создайте класс Users с параметрами:
        - String name;
        - String surname;
        Конструкторы по умолчанию и с параметрами. Создайте геттеры и сеттеры
        Создайте интерфейс UserBeanLocal с методами:
        Users[] getAllUsers();
        Users[] getUsersByName(String name);
        Users[] getUsersBySurname(String surname);
        Создайте класс UserBean которая реализовывает интерфейс UserBeanLocal.
        - Users[] users;
        Реализуйте все методы.
        В главном классе создайте массив из минимум 10 объектов класса Users. Создайте объект класса UserBean. Используя данный класс, выведите список всех пользователей, и всех пользователей на имя "John", и выведите список людей на фамилию "Smith".*/


        Engine engines[] = {
                new RenaultEngine(5.8, 12, 1000, 2),
                new FerrariEngine(4.5, 12, 800)
        };

        for (Engine engine : engines) {
            System.out.println(engine.efficiency());
            System.out.println(engine.breakEnergy());
        }
    }

}
abstract class Engine {

    private double engineVolume;
    private int cylinderAmount;
    private double engineWeight;

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }

}

class FerrariEngine extends Engine {

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    double efficiency() {
        return 0.25;
    }

    @Override
    double throttleEnergy() {
        return getEngineVolume()*getCylinderAmount()*100;
    }

    @Override
    double breakEnergy() {
        return getEngineWeight() * 2;
    }
}

class RenaultEngine extends Engine {

    private double extraTurboEnergy;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    double efficiency() {
        return 0.27;

    }

    @Override
    double throttleEnergy() {
        return getEngineWeight() * 0.15;
    }

    @Override
    double breakEnergy() {
        return getCylinderAmount() * 8;
    }
}


