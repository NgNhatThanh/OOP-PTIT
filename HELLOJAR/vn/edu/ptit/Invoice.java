package HELLOJAR.vn.edu.ptit;

import HELLOJAR.PaymentController;

import java.util.List;

public class Invoice {

    private Student student;

    private Rule rule;

    private float amount;

    private List<Subject> subjects;

    public Invoice(Student student, Rule rule, List<Subject> subjects){
        this.student = student;
        this.rule = rule;
        this.subjects = subjects;
        this.amount = 0;
        for(Subject sb : subjects){
            amount += sb.getCredit() * PaymentController.creditPrice;
        }
    }

    public Student getStudent(){
        return student;
    }

    public float getAmount(){
        return amount;
    }

    public Rule getRule(){
        return rule;
    }

    public List<Subject> getSubjects(){
        return subjects;
    }

}
