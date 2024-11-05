public class Candy {
    boolean isSour;
    String type;
    int calories;

    public Candy(boolean paramIsSour, String paramType, int paramCalories) {
        isSour = paramIsSour;
        type = paramType;
        calories = paramCalories;
    }

    public void printInfo() {
        System.out.println("Type of candy: " + type);
        System.out.println("Number of calories: " + calories);
        System.out.println("Is sour: " + isSour);

    }
}