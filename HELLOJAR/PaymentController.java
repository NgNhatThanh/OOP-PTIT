package HELLOJAR;

import HELLOJAR.vn.edu.ptit.Invoice;
import HELLOJAR.vn.edu.ptit.Rule;
import HELLOJAR.vn.edu.ptit.Student;
import HELLOJAR.vn.edu.ptit.Subject;

import java.util.ArrayList;
import java.util.List;

import static HELLOJAR.HELLOJAR.cin;

public class PaymentController {

    Invoice invoice;

    public static int creditPrice;

    public PaymentController(){
        Student st = new Student(cin.nextLine(), cin.nextLine(), Integer.parseInt(cin.nextLine()));
        List<Subject> subjects = new ArrayList<>();
        for(int i = 0; i < st.getSubjectAmount(); ++i){
            Subject sb = new Subject(cin.nextLine(), cin.nextLine(), Integer.parseInt(cin.nextLine()));
            subjects.add(sb);
        }
        Rule rule = new Rule(cin.nextLine(), cin.nextLine());
        creditPrice = cin.nextInt();
        this.invoice = new Invoice(st, rule, subjects);
    }

    public Invoice getInvoice(){
        return invoice;
    }

}
