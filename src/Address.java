public class Address implements IClonforAdress{
    private String city = null;
    private String street = null;
    private int houseNumber;

    public Address() {
    }
    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Address swallowCopy(Address address) {
        Address address_ = address;
        return address_;
    }

    @Override
    public Address deepCopy() throws CloneNotSupportedException {
        return (Address) super.clone();
    }


}

class User {
    public String name = null;
    public String lastName = null;
    public double age;
    public Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

interface IClonforAdress extends Cloneable{
    Address swallowCopy(Address address);
    Address deepCopy() throws CloneNotSupportedException;

}


