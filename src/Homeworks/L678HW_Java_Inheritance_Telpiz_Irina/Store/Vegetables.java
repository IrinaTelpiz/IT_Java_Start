package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Store;

class Vegetables extends Products{

    public Vegetables(String prodName, double price) {
        super(prodName, price);
    }


    public String getProduct() {
        return "Vegetable";
    }
}
