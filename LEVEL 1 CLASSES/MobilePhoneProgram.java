class MobilePhoneProgram {
    String brand;
    String model;
    double price;

    MobilePhoneProgram(String brand, String model, double price) {
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

    public static void main(String[] args) {
        MobilePhoneProgram phone = new MobilePhoneProgram("Redmi", "Prime Model", 9000);
        MobilePhoneProgram phone2= new MobilePhoneProgram("iphone " , "ifteen ",90000);


        phone.showDetails();
        phone2.showDetails();
    }
}
