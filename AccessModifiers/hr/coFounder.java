package AccessModifiers.hr;

import AccessModifiers.hr.*;

public class coFounder {
    protected String coFounder = "Kim";

    public static void main(String[] args) {
        founder objF = new founder();
        coFounder objCF = new coFounder();
        System.out.println("Default : " + objCF.coFounder);
    }

}
