package cannata.Customer;

public class Customer {
    private String name;
    public void setName(String n) {name = n;}
    public String getName() {return name;}

    private String address;
    public void setAddress(String a) {address = a;}
    public String getAddress() {return address;}

    private String city;
    public void setCity(String c) {city = c;}
    public String getCity() {return city;}

    private String state;
    public void setState(String s) {state = s;}
    public String getState() {return state;}

    private String postalCode;
    public void setPostalCode(String p) {postalCode = p;}
    public String getPostalCode() {return postalCode;}

    public String getNameAndAddress() {
        return (name + "\n" + address + "\n" + city + ", " + state + " " + postalCode);
    }
}