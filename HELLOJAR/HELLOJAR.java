package HELLOJAR;

import HELLOJAR.view.InvoiceView;
import HELLOJAR.vn.edu.ptit.Invoice;

import java.util.Scanner;

public class HELLOJAR {

    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
