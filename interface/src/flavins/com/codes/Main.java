package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    ITelephone jamesPhone;
	    jamesPhone = new DeskPhone(545678);

	    jamesPhone.powerOn();
	    jamesPhone.dial(34678);
	    jamesPhone.answer();

	    jamesPhone = new MobilePhone(45678);
	    jamesPhone.powerOn();
	    jamesPhone.answer();
	    jamesPhone.callPhone(45324);
    }
}
