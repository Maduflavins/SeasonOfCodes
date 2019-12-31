package flavins.com.codes;

public class Main {

    public static void main(String[] args) {

        Harmburgers harmburger = new Harmburgers("Simple", 38.5, "Sausage", "White");
        double price = harmburger.itemizeHarmbugger();
        harmburger.addHambuggerItem1("Tomato", 30.8);
        harmburger.addHambuggerItem2("Cheese", 40.8);
        price = harmburger.itemizeHarmbugger();

        HealtyBugger healtyBugger = new HealtyBugger(100.98, "Bacon");
        healtyBugger.addHealtyExyra1("chees", 88.0);
        healtyBugger.addHealtyExtra2("bones", 45.9);
        System.out.println("The total healty burger price is " + healtyBugger.itemizeHarmbugger());


       DeluxBugger delux = new DeluxBugger();
       delux.itemizeHarmbugger();
       delux.addHambuggerItem1("soup", 89.9);

    }
}
