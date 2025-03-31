package HELLOJAR.vn.edu.ptit;

import static HELLOJAR.HELLOJAR.cin;

public class Student {

    private String name;

    private String code;

    private int subjectAmount;

    public Student(String code, String name, int subjectAmount){
        this.code = code;
        this.name = name;
        this.subjectAmount = subjectAmount;
    }

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }

    public int getSubjectAmount(){
        return subjectAmount;
    }

}
