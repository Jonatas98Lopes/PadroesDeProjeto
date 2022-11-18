package SubSystem;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void getClientData(String name, String postalCode, String city,
                                     String state) {
        System.out.println("Client's data saved in the CRM service.");
        System.out.println(name);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(state);

    }
}
