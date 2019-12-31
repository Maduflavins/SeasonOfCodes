package flavins.com.codes;


class Innosen extends Car{
    public Innosen(String name, int cylinders) {
        super(name, cylinders);

    }


    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+"=>Starting");
    }

    @Override
    public void accelarate() {
        System.out.println(getClass().getSimpleName()+"=>is accelerating");
    }

    @Override
    public void addBreak() {
        System.out.println(getClass().getSimpleName()+"=>break has been applied");
    }
}

