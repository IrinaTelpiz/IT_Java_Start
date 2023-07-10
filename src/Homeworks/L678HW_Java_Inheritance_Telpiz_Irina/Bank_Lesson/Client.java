package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Bank_Lesson;

import Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.Bank_Lesson.Account;

import java.util.ArrayList;
import java.util.List;

class Client {

    private String name;
    private List<Account> accounts;

    public Client(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
