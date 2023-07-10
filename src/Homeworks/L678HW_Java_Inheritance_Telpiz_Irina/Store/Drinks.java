package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Store;

class Drinks extends Products{

    public Drinks(String prodName, double price) {
        super(prodName, price);
    }

    public String getProduct() {
        return "Drink";
    }
}
