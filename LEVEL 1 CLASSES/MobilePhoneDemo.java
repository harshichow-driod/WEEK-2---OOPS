
class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void showDetails() {
        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : Rs." + price);
    }
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
       


        MobilePhone phone = new MobilePhone(Redmi , primeModel , 9000);
        phone.showDetails();

        scanner.close();
    }
}
