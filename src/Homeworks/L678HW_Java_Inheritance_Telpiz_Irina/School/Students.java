package Homeworks.L678HW_Java_Inheritance_Telpiz_Irina.School;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Students {

    private String name;
    private Map<String, List<Integer>> grades;

    public Students(String name) {
        this.name = name;
        grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public  void addGrade(String subject, int grade){
        if (!grades.containsKey(subject)){
            grades.put(subject, new ArrayList<>());
        }
        grades.get(subject).add(grade);
    }

    public void updateGrade(String subject, int index, int newGrade){
        if (grades.containsKey(subject) && index >=0 && index < grades.get(subject).size()){
            grades.get(subject).set(index, newGrade);
        }
    }

    public int getSubjectAvg(String subject){
        if (grades.containsKey(subject)){
            List<Integer> subjectGrade = grades.get(subject);
            int sum = 0;
            for (int grade : subjectGrade){
                sum += grade;
            }
            return sum / subjectGrade.size();

        }
        return 0;
    }

    public int getAllGradesAvg(){
        if (grades.isEmpty()){
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (List<Integer> subjectGrade : grades.values()){
            for (int grade : subjectGrade){
                sum += grade;
                count++;
            }
        }
        return sum / count;

    }
}
