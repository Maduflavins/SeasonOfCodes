package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    Wall wall1 = new Wall("North");
	    Wall wall2 = new Wall("East");
	    Wall wall3 = new Wall("South");
	    Wall wall4 = new Wall("East");



	    Ceiling ceiling = new Ceiling(12, "white");
	    Bed bed = new Bed("Othodox", 5, 4, 5, 4);
	    Lamp lamp = new Lamp("Table", true, 4);

	    Bedroom bedroom = new Bedroom("James", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
	    bedroom.makeBed();
	    bedroom.getLamp().turnOn();
    }
}
