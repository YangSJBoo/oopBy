package ddtest;

public class Address {
    String addraess;//地址
    String zipCode;//邮编
    public Address() {}//无参构造

    public Address(String addraess, String zipCode) {
        this.addraess = addraess;
        this.zipCode = zipCode;
        System.out.println("地址是："+addraess+"，邮编是："+zipCode);
    }

    public static void main(String[] args) {
        Address address=new Address("南京","123");
    }
}
