package hamer.customer;

public class CustomerDB {
    public static Customer getCustomer(int customerNumber) {
        if (customerNumber == 1001) {
            Customer c1 = new Customer();
            c1.setName("Barbara White");
            c1.setAddress("3400 Richmond Parkway #3423");
            c1.setCity("Bristol");
            c1.setState("CT");
            c1.setPostalCode("06010");
            return c1;
        } else if (customerNumber == 1002) {
            Customer c2 = new Customer();
            c2.setName("Karl Vang");
            c2.setAddress("327 Franklin Street");
            c2.setCity("Edina");
            c2.setState("MN");
            c2.setPostalCode("55435");
            return c2;
        } else if (customerNumber == 1003) {
            Customer c3 = new Customer();
            c3.setName("Ronda Chavan");
            c3.setAddress("518 Commanche Dr.");
            c3.setCity("Greensboro");
            c3.setState("NC");
            c3.setPostalCode("27410");
            return c3;
        } else {
            return null;
        }
    }
}