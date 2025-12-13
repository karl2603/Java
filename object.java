public class object {
    String name;
    String brand;
    int titles;

    public static void main(String args[]) {
        object wrestler1 = new object();
        wrestler1.name = "Seth Rollins";
        wrestler1.titles = 6;
        object wrestler2 = new object();
        wrestler2.name = "Roman Reigns";
        wrestler2.titles = 6;
        object wrestler3 = new object();
        wrestler3.name = "Cody Rhodes";
        wrestler3.titles = 2;
        System.out.println(wrestler2.name + " is a " + wrestler2.titles + " times World Champion");
        System.out.println(wrestler3.name + " is a " + wrestler3.titles + " times World Champion");
        System.out.println(wrestler1.name + " is a " + wrestler1.titles + " times World Champion");

    }
}
