public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException{
        Address ad = new Address("Dnepr","Kalinovaya",10);
        User user1 = new User("Sergey",ad);
        Address ad2 = ad.swallowCopy(user1.address);
        User user2 = new User("Masha",ad2);
        user2.address.setCity("London");

        System.out.println(user1.getName() + " live in the " + user1.getAddress().getCity() + " city, " +
                "at the " + user1.address.getStreet() + " street, in the house number - " + user1.getAddress().getHouseNumber());


        System.out.println(user2.getName() + " live in the " + user2.getAddress().getCity() + " city, " +
                "at the " + user2.address.getStreet() + " street, in the house number - " + user2.getAddress().getHouseNumber());
    }

}
