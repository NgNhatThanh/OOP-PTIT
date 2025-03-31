package HELLOJAR.view;

import HELLOJAR.vn.edu.ptit.Invoice;
import HELLOJAR.vn.edu.ptit.Subject;

public class InvoiceView {

    public static void show(Invoice invoice){
        System.out.println("Mã sinh viên: " + invoice.getStudent().getCode());
        System.out.println("Họ tên: " + invoice.getStudent().getName());
        System.out.println("Các môn học:");
        for (Subject subject : invoice.getSubjects()) {
            System.out.println(subject.getName());
        }
        System.out.println("Học phí phải nộp là: " + invoice.getAmount());
        System.out.println("Theo QĐ: " + invoice.getRule().getCode());
    }

}
