package flavins.com.codes;

public class Harmburgers {

    private String name;
    private double price;
    private String meat;
    private String breadRollType;


    private String item1Name;
    private double item1Price;

    private String item2Name;
    private double item2Price;

    private String item3Name;
    private double item3Price;


    private String item4Name;
    private double item4Price;




    public Harmburgers(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }


    public void addHambuggerItem1(String name, double price){
        this.item1Name = name;
        this.item1Price = price;
    }

    public void addHambuggerItem2(String name, double price){
        this.item2Name = name;
        this.item2Price = price;
    }

    public void addHambuggerItem3(String name, double price){
        this.item3Name = name;
        this.item3Price = price;
    }
    public void addHambuggerItem4(String name, double price){
        this.item4Name = name;
        this.item4Price = price;
    }

    public double itemizeHarmbugger(){
        double harmbuggerPrice = this.price;
        System.out.println(this.name + " hambugger  on " + this.breadRollType + " price is " + this.price );

        if(this.item1Name!=null){
            harmbuggerPrice+=item1Price;
            System.out.println(this.item1Name + " has been added to the hambugger the price is " + this.item1Price+ " your total price now is " + harmbuggerPrice );
        }

        if(this.item2Name!=null){
            harmbuggerPrice+=item2Price;
            System.out.println(this.item2Name + " has been added to the hambugger the price is " + this.item2Price + " your total price now is " + harmbuggerPrice );
        }
        if(this.item3Name!=null){
            harmbuggerPrice+=item3Price;
            System.out.println(this.item3Name + " has been added to the hambugger the price is " + this.item3Price + " your total price now is " + harmbuggerPrice );
        }
        if(this.item4Name!=null){
            harmbuggerPrice+=item1Price;
            System.out.println(this.item4Name + " has been added to the hambugger the price is " + this.item4Name + " your total price now is " + harmbuggerPrice );
        }
        return harmbuggerPrice;
    }
}

