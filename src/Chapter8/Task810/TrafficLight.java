package Chapter8.Task810;

public enum TrafficLight {

    // declare constants of enum type
    RED(10),
    GREEN(15),
    YELLOW(5);

    // instance fields
    private final int durationOfThLight; // copyright year

    // enum constructor
    TrafficLight(int durationOfThLight) {
        this.durationOfThLight = durationOfThLight;
    }

    // accessor for field durationOfThLight
    public int getDurationOfThLight() {
        return durationOfThLight;
    }
}
