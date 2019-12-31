package flavins.com.codes;

public class MobilePhone implements ITelephone {
    private int myNUmber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNUmber) {
        this.myNUmber = myNUmber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone is coming up give it a minute");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now dialing " + phoneNumber + " on deskphone");
        }else{
            System.out.println("Phone is powered off");
        }


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
        if(phoneNumber==myNUmber && isOn){
            isRinging=true;
            System.out.println("Ring ring");
        }else{
            isRinging=false;
            System.out.println("Mobile phone is powered off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
