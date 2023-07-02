package Homeworks.L5HW_Java_Arrays_Telpiz_Irina;

class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    void put(char ch){
        if (putloc== q.length-1){
            System.out.println(" - Queue is FULL");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc==putloc){
            System.out.println(" - Queue is EMPTY");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
