package SecondSubSystem;

public class PostalCodeAPI {
    private static PostalCodeAPI instancia = new PostalCodeAPI();

    public PostalCodeAPI() {

        super();
    }

    public static PostalCodeAPI getInstancia() {
        return instancia;
    }
    public String findCity(String postalCode) {
        return "New York";
    }
    public String findState(String postalCode) {
        return "New York";
    }
}