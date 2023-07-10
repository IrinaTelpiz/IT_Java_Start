package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina;

class Truck extends Vehicle {

    private int cargoCap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargoCap = c;
    }

    int getCargoCap(){
        return cargoCap;
    }

    void putCargo(int c){
        cargoCap = c;
    }
}
