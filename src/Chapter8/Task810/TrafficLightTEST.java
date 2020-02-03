package Chapter8.Task810;

public class TrafficLightTEST {
    public static void main(String[] args) {
        System.out.println("All Traffic Lights:");

        // print all enum constants and their durations
        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.printf("%-8s%-3d%n", trafficLight, trafficLight.getDurationOfThLight());
        }
    }
}
