package flavins.com.codes;

public class Main {

    public static void main(String[] args) {

        Autopolicy policy1 = new Autopolicy(11111111, "Toyota Camry", "NJ");
        Autopolicy policy2 = new Autopolicy(22222222, "Ford Fusion", "ME");
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }


    public static void policyInNoFaultState(Autopolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                            policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }

}
