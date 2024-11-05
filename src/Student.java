public class Student {
    String name;
    int nCandy;
    boolean costume;

    public Student(String paramName, int paramNCandy, boolean paramCostume) {
        costume = paramCostume;
        nCandy = paramNCandy;
        name = paramName;
    }

    public void printInfo() {
        System.out.println("Name of student: " + name);
        System.out.println("Number of candy: " + nCandy);
        System.out.println("Has costume: " + costume);
    }
}