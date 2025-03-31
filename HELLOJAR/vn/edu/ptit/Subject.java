package HELLOJAR.vn.edu.ptit;

import static HELLOJAR.HELLOJAR.cin;

public class Subject {

    private String code;

    private String name;

    private int credit;

    public Subject(String code, String name, int credit){
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public String getName(){
        return name;
    }

    public int getCredit(){
        return credit;
    }

}
