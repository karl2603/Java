class returnKeyQ1 {
    String getName() {
        String name = "Karl Arvindraj";
        return name;
    }

    long getPhone() {
        long phone = 7550196803L;
        return phone;
    }

    public static void main(String args[]) {
        returnKeyQ1 obj = new returnKeyQ1();
        System.out.println("Name : " + obj.getName());
        System.out.println("Phone : " + obj.getPhone());

    }
}