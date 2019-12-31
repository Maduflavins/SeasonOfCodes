package flavins.com.codes;

public class DeluxBugger extends Harmburgers{
    public DeluxBugger() {
        super("Delux", 4.50, "chicken", "brown");

        super.addHambuggerItem1("Potatoe", 200.8);
        super.addHambuggerItem2("Fish", 89.90);
    }

    @Override
    public void addHambuggerItem1(String name, double price) {
        System.out.println("Cannot add additional item");
    }

    @Override
    public void addHambuggerItem2(String name, double price) {
        System.out.println("Cannot add  additional item");
    }

    @Override
    public void addHambuggerItem3(String name, double price) {
        System.out.println("cannot add additional item");
    }

    @Override
    public void addHambuggerItem4(String name, double price) {
        System.out.println("Cannot add additional item");
    }
}
