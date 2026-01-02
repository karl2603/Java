package AccessModifiers.employee;

import AccessModifiers.hr.*;

public class managers extends coFounder {
    public static void main(String[] args) {
        founder obj = new founder();
        managers objCF = new managers();
        System.out.println("Protected : " + objCF.coFounder);
        System.out.println("Public : " + obj.CEO);
    }
}
