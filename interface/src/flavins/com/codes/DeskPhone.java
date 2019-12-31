package flavins.com.codes;

public class DeskPhone implements ITelephone {

    private int myNUmber;
    private boolean isRinging;

    public DeskPhone(int myNUmber) {
        this.myNUmber = myNUmber;
    }

    @Override
    public void powerOn() {
        System.out.println("Coming up please wait for the phone to come up");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " on deskphone");

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Ansering the phone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNUmber){
            isRinging=true;
            System.out.println("Ring ring");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
