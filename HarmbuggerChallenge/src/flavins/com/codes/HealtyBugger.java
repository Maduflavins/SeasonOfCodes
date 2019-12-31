package flavins.com.codes;

public class HealtyBugger extends Harmburgers {
    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;


    public HealtyBugger(double price, String meat) {
        super("Healty Bugger", price, meat, "Brown rye");
    }

    public void addHealtyExyra1(String name, double price){
        this.healtyExtra1Name = name;
        this.healtyExtra1Price = price;

    }

    public void addHealtyExtra2(String name, double price){
        this.healtyExtra2Name = name;
        this.healtyExtra2Price = price;

    }

    @Override
    public double itemizeHarmbugger() {
        double harmbuggerPrice = super.itemizeHarmbugger();
        if(this.healtyExtra1Name!=null){
            harmbuggerPrice+=healtyExtra1Price;
            System.out.println(this.healtyExtra1Name + " added, the price is " + this.healtyExtra1Price + " price is " + harmbuggerPrice);
        }
        if(this.healtyExtra2Name!=null){
            harmbuggerPrice+=healtyExtra2Price;
            System.out.println(this.healtyExtra2Name + " added, the price is " + this.healtyExtra2Price + "price is " + harmbuggerPrice);
        }

        return harmbuggerPrice;
    }
}
