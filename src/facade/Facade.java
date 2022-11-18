package facade;

import SecondSubSystem.PostalCodeAPI;
import SubSystem.CrmService;

public class Facade {
    public void getClient(String name, String postalCode) {
        String city = PostalCodeAPI.getInstancia().findCity(postalCode);
        String state = PostalCodeAPI.getInstancia().findState(postalCode);
        CrmService.getClientData(name, postalCode, city, state);
    }
}
