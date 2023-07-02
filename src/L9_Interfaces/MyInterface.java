package L9_Interfaces;

public interface MyInterface {

    int getUserId();
    default int getAdmin(){
        return 1;
    }
}
