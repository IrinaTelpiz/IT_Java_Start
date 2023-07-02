package L11_Collections;

public class Patient implements Comparable<Patient>{

    String name;
    int age;
    byte severity;

    @Override
    public int compareTo(Patient o) {
        if (severity < o.severity) return 1;
        else if (severity > o.severity) return -1;
        else return 0;
    }

    public Patient(String name, int age, byte severity) {
        this.name = name;
        this.age = age;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", severity=" + severity +
                '}';
    }


}
