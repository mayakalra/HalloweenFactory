public class HalloweenFactory {

    int year;
    int temperature;

    public static void main(String[] args) {
        HalloweenFactory myStore;
        myStore = new HalloweenFactory();
        myStore.year = 2024;
        myStore.temperature = 60;

        System.out.print("My Halloween store in " + myStore.year + " has a temperature at " + myStore.temperature + " degrees!");
    }
    public HalloweenFactory() {
        Candy candy1;
        candy1 = new Candy(true, "chocolate",200);
        candy1.printInfo();

        Student student1;
        student1 = new Student("billy", 5,true);
        student1.printInfo();
    }
}