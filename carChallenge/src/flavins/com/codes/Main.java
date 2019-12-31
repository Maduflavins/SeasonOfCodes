package flavins.com.codes;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }


    public int getCylinders() {
        return cylinders;
    }


    public void startEngine(){
        System.out.println("Car=>Engine Staring");
    }

    public void accelarate(){
        System.out.println("Car=> is acelerating");
    }

    public void addBreak(){
        System.out.println("Car=> has been stopped");
    }
}


class Kia extends Car{
    public Kia(String name, int cylinders) {
        super(name, cylinders);

    }


    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+"=>Starting");
    }

    @Override
    public void accelarate() {
        System.out.println(getClass().getSimpleName() + "=>is accelerating");
    }

    @Override
    public void addBreak() {
        System.out.println(getClass().getSimpleName()+"=>break has been applied");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mercedes", 8);
        car.accelarate();
        car.addBreak();
        car.startEngine();

        Kia kia  = new Kia("Piktanko", 4);
        kia.accelarate();
        kia.addBreak();
        kia.startEngine();

        Innosen innosen = new Innosen("Winger", 8);
        innosen.accelarate();
        innosen.addBreak();
        innosen.startEngine();

    }
}
