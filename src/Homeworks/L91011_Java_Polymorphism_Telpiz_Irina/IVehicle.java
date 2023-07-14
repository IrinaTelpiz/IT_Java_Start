package Homeworks.L91011_Java_Polymorphism_Telpiz_Irina;

public interface IVehicle {
    int range();
    double fuelNeeded(int miles);
    int getPassengers();
    void setPassengers();
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
