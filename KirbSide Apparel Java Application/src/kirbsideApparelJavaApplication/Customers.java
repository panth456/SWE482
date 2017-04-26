package kirbsideApparelJavaApplication;


public class Customers {

    //Attributes
    String firstName;
    String lastName;
    String email;
    String address1;
    String address2;
    String city;
    String state;
    int zipCode;
    String userName;
    String password;

    //Constructor
    Customers(String firstName, String lastName, String email, String address1, String address2,
            String city, String state, int zipCode, String userName,
            String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.userName = userName;
        this.password = password;
    }

    //Getters and Setters
    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getAddress1() {
        return address1;
    }
    
    String getAddress2() {
        return address2;
    }

    String getCity() {
        return city;
    }

    String getState() {
        return state;
    }

    int getZipCode() {
        return zipCode;
    }

    String getEmail() {
        return email;
    }

    void setFirstName(String nextLine) {
        firstName = nextLine;
    }

    void setLastName(String nextLine) {
        lastName = nextLine;
    }

    void setEmail(String nextLine) {
        email = nextLine;
    }

    void setAddress1(String nextLine) {
        address1 = nextLine;
    }
    
    void setAddress2(String nextLine) {
        address2 = nextLine;
    }

    void setCity(String nextLine) {
        city = nextLine;
    }

    void setState(String nextLine) {
        state = nextLine;
    }

    void setZipCode(int nextLine) {
        zipCode = nextLine;
    }

    void setUserName(String nextLine) {
        userName = nextLine;
    }

    void setPassword(String nextLine) {
        password = nextLine;
    }
}
